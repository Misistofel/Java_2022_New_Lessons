import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class NotChild {
    public static void main(String[] args) {
        ParentOne p = new ParentOne("Sasha", 3500);
        ChildOne ch = new ChildOne("Ira", 5000, 40);
        ch.def();
        System.out.println( ch instanceof ParentOne);
        System.out.println(ch.toString());



        String s = "60";
        int e = Integer.parseInt(s);
        System.out.println(e+1);

        int k= 10;
        String l = String.valueOf(k);
        System.out.println(l);
        System.out.println( l.equals("10"));


        int i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }




        List<Integer> al = new ArrayList<>();
        al.add(11);
        al.add(10);
        al.add(1);
        al.add(2);

        for (Integer a:al) {
            System.out.println(a);
        }

        System.out.println("This is " + p.getClass() + " class!");
        System.out.println( p.toString());
    }
}