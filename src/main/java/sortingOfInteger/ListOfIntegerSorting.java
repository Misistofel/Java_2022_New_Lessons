package sortingOfInteger;

import java.util.*;

public class ListOfIntegerSorting {
    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(12);
        list.add(1);
        list.add(2);
        list.add(122);
        list.add(23);
        list.add(201);
        System.out.println("Before " + list);

        Iterator <Integer> it = list.iterator();
        while (it.hasNext()){
            if(it.next() % 2 != 0){
                it.remove();
            }
        }
        System.out.println("After " + list);
    }


}
