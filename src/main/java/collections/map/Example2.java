package collections.map;

import java.util.*;

public class Example2 {
    public static void main(String[] args) {
        List <String>  list1 = new ArrayList<>();
        list1.add("Diana");
        list1.add("Anna");
        list1.add("Cameron");
        list1.add("Berta");

        System.out.println(list1);
        Collections.sort(list1);

        System.out.println(list1);

        Student st1 = new Student("Oleh", "Baran", 2);
        Student st2 = new Student("Irena", "Karpa", 5);
        Student st3 = new Student("Iren", "Zeta", 4);



    }
}
