import io.github.swagger2markup.Swagger2MarkupConverter;

import java.nio.file.Path;
import java.nio.file.Paths;


public class Converter {
    public static void main(String[] args) {
        Path localSwaggerFile = Paths.get("/home/prateek/Documents/work/Flock-Swagger/flock.yaml");
        Path outputFile = Paths.get("/home/prateek/Documents/work/swagger");
        Swagger2MarkupConverter.from(localSwaggerFile)
                .build()
                .toFile(outputFile);

//        Asciidoctor asciidoctor = create();
//        String html = asciidoctor.convertFile(
//                new File("/home/prateek/Documents/work/swagger.adoc"),
//                new HashMap<String, Object>());
//        System.out.println(html);
    }
}
