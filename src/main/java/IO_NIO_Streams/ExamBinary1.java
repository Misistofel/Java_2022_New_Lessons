package IO_NIO_Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExamBinary1 {
    public static void main(String[] args) {
        try(FileInputStream fis = new FileInputStream("/Users/mtofel/IdeaProjects/Java_2022_New_Lessons/AJ.png");
            FileOutputStream fos = new FileOutputStream("/Users/mtofel/IdeaProjects/Java_2022_New_Lessons/AJJJJJ.png")) {
            int i;
            while((i=fis.read())!=-1){
                fos.write(i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
