package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSort {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList <String> alist = new ArrayList<>();
        alist.add(s3);
        alist.add(s1);
        alist.add(s4);
        alist.add(s2);
        System.out.println(alist);
        //Використовуємо
        Collections.sort(alist);
        System.out.println(alist);


    }
}
