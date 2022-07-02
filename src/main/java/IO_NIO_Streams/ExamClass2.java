package IO_NIO_Streams;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExamClass2 {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
            reader = new FileReader("/Users/mtofel/IdeaProjects/Java_2022_New_Lessons/ReadThisFile.txt\"");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
