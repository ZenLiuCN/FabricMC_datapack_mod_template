package generator;

import lombok.SneakyThrows;
import lombok.val;
import org.jooq.lambda.Seq;
import org.jooq.lambda.tuple.Tuple4;
import org.jooq.lambda.tuple.Tuple5;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;

import static org.jooq.lambda.Seq.seq;

/**
 * @author Zen.Liu
 * @since 2022-07-11
 */
public interface Recipes {
    record result(String item, int count) {
        public static result of(String item, int count) {
            return new result(item, count);
        }
    }
    record crafting(
            String type,
            List<String> pattern,
            Map<String, Map<String, String>> key,
            result result
    ) {
        crafting(List<String> pattern,
                 Map<String, Map<String, String>> key,
                 result result) {
            this("minecraft:crafting_shaped", pattern, key, result);
        }

        crafting(String pattern,
                 Map<String, Map<String, String>> key,
                 result result) {
            this(Collections.singletonList(pattern), key, result);
        }
    }
    record stonecutting(
            String type,
            int count,
            Map<String, String> ingredient,
            String result
    ) {
        stonecutting(int count,
                     Map<String, String> ingredient,
                     String result) {
            this("minecraft:stonecutting", count, ingredient, result);
        }
    }
    record smelting(
            String type,
            int cookingtime,
            float experience,
            Map<String, String> ingredient,
            String result
    ) {
        smelting(int cookingtime,
                 float experience,
                 Map<String, String> ingredient,
                 String result) {
            this("minecraft:smelting", cookingtime, experience, ingredient, result);
        }
    }
    static String mc(String value) {
        return value.contains(":") ? value : ("minecraft:" + value);
    }
    @SneakyThrows
    static void write(Path root, Object any) {
        final UnaryOperator<Path> rename = s -> {
            if (s.toFile().exists()) {
                val ext = ".json";
                val name = s.toString().substring(0, s.toString().lastIndexOf("."));
                for (int i = 1; i < 10; i++) {
                    val tmp = Paths.get(name + "_" + i + ext);
                    if (!tmp.toFile().exists()) {
                        return tmp;
                    }
                }
                throw new IllegalStateException("almost ten file already exists!");
            }
            return s;
        };
        Path f;
        if (any instanceof smelting) {
            f = rename.apply(root.resolve("_smelting_" + ((smelting) any).result.split(":")[1] + ".json"));
        } else if (any instanceof crafting) {
            f = rename.apply(root.resolve("_crafting_" + ((crafting) any).result.item.split(":")[1] + ".json"));
        } else if (any instanceof stonecutting) {
            f = rename.apply(root.resolve("_stonecutting_" + ((stonecutting) any).result.split(":")[1] + ".json"));
        } else {
            throw new IllegalStateException("not valid type");
        }
        Files.writeString(f, Generator.g.get().toJson(any));
    }
    static Seq<Object> crafts(String pattern, Seq<Tuple4<String, String, String, Integer>> recipe) {
        return seq(recipe)
                .map(k -> {
                    return new crafting(k.v1.isEmpty() ? pattern : k.v1,
                            Map.of(
                                    "#", Map.of("tag", mc("planks")),
                                    "I", Map.of("item", mc(k.v2))),
                            result.of(mc(k.v3), k.v4));
                })
                ;
    }

    static Seq<Object> smelt(Seq<Tuple5<Integer, Float, String, String, String>> recipe) {
        return seq(recipe)
                .map(k -> new smelting(
                        (int) k.v1,
                        (float) k.v2,
                        Map.of(k.v3, mc(k.v4)),
                        mc(k.v5)))
                ;
    }

    static Seq<Object> stonecut(Seq<Tuple4<Integer, String, String, String>> recipe) {
        return seq(recipe)
                .map(k -> new stonecutting(
                        (int) k.v1,
                        Map.of(k.v2, mc(k.v3)),
                        mc(k.v4)))
                ;
    }

    static Seq<Object> transTo(String type, String from, Seq<String> recipe) {
        return transTo(1, type, from, recipe);
    }

    static Seq<Object> transTo(int n, String type, String from, Seq<String> recipe) {
        return seq(recipe)
                .map(k -> new stonecutting(
                        n,
                        Map.of(type, mc(from)),
                        mc(k)))
                ;
    }

    static Seq<Object> dup(Seq<String> recipe) {
        return seq(recipe)
                .map(k -> new stonecutting(
                        2,
                        Map.of("item", mc(k)),
                        mc(k)))
                ;
    }

    static Seq<Object> stack(Seq<String> recipe) {
        return seq(recipe)
                .map(k -> new stonecutting(
                        64,
                        Map.of("item", mc(k)),
                        mc(k)))
                ;
    }


}
