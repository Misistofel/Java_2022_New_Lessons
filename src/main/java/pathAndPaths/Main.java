package pathAndPaths;

import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

        WorkWithCreationDeletionFilesViaPath w = new WorkWithCreationDeletionFilesViaPath("src/main/java/level1/level2_2");
        Path dir = w.createDirectory(Path.of("src/main/java/level1/level2_3"));
        Path copiedDirectory = w.copyDirectory(dir, Path.of("src/main/java/level1/level2/level2_3"));
       // Path newDir = w.renameDirectory(dir,"NEW.properties");
//        Path file = w.createFile("hhh.txt", dir);
//        w.deleteFile(file);
  //      w.deleteFolder(copiedDirectory);

    }
}