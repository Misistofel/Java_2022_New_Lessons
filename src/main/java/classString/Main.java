package classString;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import static java.util.Arrays.sort;

public class Main {
    public static void main(String[] args) {



int z = 5;
int x = 6;
//        System.out.println(" " + z+x);
//
//            ArrayList <String> list = new ArrayList<>();
//            list.add("a");
//            list.add("b");
//            list.add("c");
//            list.add("d");
//            for (String a: list
//                 ) {
//                    System.out.print(a + " ");
//
//            }

        int [] m1 = new int[5];
        int [] m2 = {9,6,3};
        int [] m3 = new int []{7,7,7,7};
        int [][] m4 = new int [2][2];

    Arrays.sort(m2);
        for (int i = 0; i < m2.length; i++) {
            System.out.println(m2[i]);
        }

        
        


        System.out.println();
            int [] arr3 = {3,2,3};

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

            System.out.println();
            ArrayList <Integer>l3 = new ArrayList<>(20);
            System.out.println("l3 = " + l3.size());
            ArrayList <Integer> l4 = new ArrayList<>();
            ArrayList <Integer> l5 = new ArrayList<Integer>();
            List <Integer> l6 = new ArrayList<Integer>();
            List <Integer> l7 = new ArrayList<Integer>(25);
            List <Integer> l8 = new ArrayList<Integer>(l7);


        String s1 = "Hello";
        String s6 = ", world";
        System.out.println(s1.concat(s6));
        String s5 = s1.replace("H", "");
        System.out.println("s5 = " + s5);
        String  s4 = s1.substring(0, 4);
        System.out.println("s4 = " + s4);
        int a = s1.indexOf("o");
        System.out.println("index of '0' = " + a);
//        int i = s1.length();
//        System.out.println("i = " + i);
//        s1 = s1.toUpperCase(Locale.ROOT);
        System.out.println("sa = " + s1);



        String s3 = s1.toLowerCase(Locale.ROOT);
        System.out.println("s3 = " + s3);

        String s2 = s1.trim();
        int k = s2.length();
        System.out.println("k = " + k);







    }

}
