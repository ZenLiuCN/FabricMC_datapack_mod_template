package generator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Builder;
import lombok.Data;
import lombok.SneakyThrows;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Zen.Liu
 * @since 2022-07-11
 */
public interface Generator {
    Gson gson = new GsonBuilder().create();
    Gson prettyGson = new GsonBuilder().setPrettyPrinting().create();
    AtomicReference<Gson> g=new AtomicReference<>(gson);
    @Data
    @Builder
    class Define {
        private final int schemaVersion = 1;
        private List<String> authors;
        private Contact contact;
        private Depends depends;
        private String description;
        private Entrypoints entrypoints;
        private String environment;
        private String icon;
        private String id;
        private String name;
        private String license;
        private String version;

        @Data
        @Builder
        public  static class Contact {
            private String homepage;
            private String issues;
            private String sources;

        }

        @Data
        @Builder
        public static class Entrypoints {
            private List<String> client;
            private List<String> journeymap;
            private List<String> main;
        }

        @Data
        @Builder
        public static class Depends {
            @Builder.Default
            private String fabric="*";
            @Builder.Default
            private String fabricloader=">=0.14.6";
            @Builder.Default
            private String java=">=17";
            @Builder.Default
            private String minecraft="~1.19";
        }
        public void gen(){
            genModJson(this);
        }
    }

    /**
     * Generate src/main/resources/fabric.mod.json file
     * @param define the mod definition
     */
    @SneakyThrows
    static void genModJson(Define define) {
        Files.writeString(Paths.get("src/main/resources/fabric.mod.json"), g.get().toJson(define));
    }
}
