package IO_NIO_Streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class ExamClass {
    public static void main(String[] args) throws IOException {

    String s = "AJAX — это аббревиатура, которая означает Asynchronous Javascript and XML.На самом деле";
        String s1 = "Privet";
                FileWriter writer = null;
        try {
            writer = new FileWriter("/Users/mtofel/IdeaProjects/Java_2022_New_Lessons/ReadThisFile.txt", true);
            for (int i = 0; i < s1.length(); i++) {
                writer.write(s1.charAt(i));
            }
            System.out.println(" Done! ");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.close();
        }
    }
}