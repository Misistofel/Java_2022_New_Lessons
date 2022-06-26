package lesson1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Fori {
    public static void main(String[] args) {
        int a = 25;
        for (int i = 8; i < 10; i++) {
            System.out.println(i);

        }

        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                break;
            }
            System.out.println("Число " + i);
        }

        for (int i = 0; i < 10; i++) {
            if (i == 8) {
                continue;
            }
            System.out.println("This is: " + i);
        }

        while (a < 25) {
            a += 2;
            System.out.println("While cicle has: " + a);
        }



        int b = 15;
        do {
            System.out.println("INT b= " + b++);
        } while (b < 15);

        int [] array = {1,5,33,90};
        for (int aa:array
             ) {
            System.out.println("This is FOREACH - " + aa);
        }

        int [] arrr = {1,3,2,22};
        int [] arrr1 = new int[5];//[0 0 0 0 0
        int [][] arrr2 = {{1,2,3}, {4,5,6}};
        String [] arrr3 = new String [3];
        for (int i = 0; i < arrr3.length; i++) {
            arrr3[i]="Hi, " + i;
            System.out.println(arrr3[i] = "ZVIT!!!!!");
        }

        int [] ar4 = {9, 8, 7, 6, 5};
        Arrays.sort(ar4);
        for (int s:ar4) {
            System.out.println(s + " HELLO UKRAINR!");
            s++;
        }

        ArrayList <Integer> al = new ArrayList<Integer>();
        al.add(33);
        al.add(4);
        al.add(55);
        al.add(77);
        al.add(66);
        al.add(1);
        String str = al.toString();
        System.out.println(str);
        System.out.println(al.indexOf(4));
        System.out.println(al.get(0));
        System.out.println(al.remove(2));
        for (Integer aa:al) {
            System.out.println(aa);
            aa++;
        }
        System.out.println(al.isEmpty());



    }

    }


