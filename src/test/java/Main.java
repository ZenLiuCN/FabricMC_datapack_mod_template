import generator.Generator.Define;
import generator.Generator.Define.Depends;
import lombok.val;
import org.jooq.lambda.Seq;

import java.nio.file.Paths;
import java.util.List;

import static generator.Namespaces.none;
import static generator.Recipes.*;
import static org.jooq.lambda.Seq.seq;
import static org.jooq.lambda.tuple.Tuple.tuple;

/**
 * @author Zen.Liu
 * @since 2022-07-11
 */
public class Main {
    @SuppressWarnings("SpellCheckingInspection")
    static void gen() {
        //extra mod id
        val waystone = List.of("fwaystones:abyss_watcher", "fwaystones:waystone", "fwaystones:pocket_wormhole");
        val root = Paths.get("src/main/resources/data/stone_cutter/recipes");
        root.toFile().delete();
        if (!root.toFile().exists()) root.toFile().mkdirs();
       smelt(Seq.of(
                tuple(20, 1000f, "item", "coal_block", "diamond_block"), //smelt coal_block into diamond_block
                tuple(20, 0f, "item", "charcoal", "coal") //smelt charcoal into coal
        ))
                .concat(transTo("item", "bucket", seq(data.bucket)))
                .concat(transTo("tag", "coals", seq(data.dye)))
                .concat(transTo("tag", "logs", seq(data.mat)
                        .filter(none(String::contains, "quartz_", "hay_"))
                        .concat(waystone)
                        .concat("cobweb",
                                "beacon",
                                "string",
                                "gunpowder",
                                "tnt",
                                "leather",
                                "paper",
                                "book",
                                "ghast_tear",
                                "jack_o_lantern",
                                "item_frame",
                                "stone",
                                "obsidian",
                                "crying_obsidian",
                                "glowstone",
                                "quartz",
                                "amethyst_shard"
                        )))
                .concat(transTo(5, "tag", "bucket", seq(data.bucket)))
                .concat(dup(seq(data.equi)
                        .concat(seq(data.transport).filter(x -> !x.endsWith("rail")))
                        .concat(data.item)
                ))
                .concat(stack(seq(data.bio)
                        .concat(data.ore)
                        .concat(waystone)
                        .concat(data.other)
                        .concat(data.light)
                        .concat(data.building)
                        .concat(data.mat)
                        .concat(data.food)
                        .concat(data.terracotta)
                        .concat(data.redstone)
                        .concat(data.food)
                        .concat(data.dye)
                        .concat(data.transport))

                )
                .forEach(it -> write(root, it));

    }

    public static void main(String[] args) {
        //generate classified NamespaceIds only run once
        // Namespaces.classify();
        //generate my modification for recipes
        gen();
        Define.builder()
                .id("stone_cutter")
                .name("stone_cutter")
                .version("1.0.0+mc1.19")
                .description("dat pack for enchant stone cutter")
                .depends(Depends.builder()
                        .fabric("*")
                        .fabricloader(">=0.14.6")
                        .minecraft("~1.19")
                        .java(">=17")
                        .build())
                .authors(List.of("ZenLiu"))
                .build().gen();
    }
}
