package pathAndPaths.InfoAboutAllFilesByPATH;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PSVM {

    public static void main(String[] args) {
  //  FileUtils.byteCountToDisplaySize();//буде працювати без створення екземпляра класу

        try (Stream<Path> walk = Files.walk(Paths.get("main"))) {
            // We want to find only regular files
            List<String> result = walk.filter(Files::isRegularFile)
                    .map(x -> x.toString()).collect(Collectors.toList());

            result.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    }
