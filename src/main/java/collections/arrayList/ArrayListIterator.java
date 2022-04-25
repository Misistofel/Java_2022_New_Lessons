package collections.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {
    public static void main(String[] args) {

        ArrayList<Car> al1 = new ArrayList();
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        al1.add(c1);
        al1.add(c2);
        al1.add(c2);

        Iterator<Car> it = al1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//Існує ще ListIterator
        ListIterator <Car> li = al1.listIterator();
        while(li.hasNext()){//перевірка чи є наступний елемент
            li.next();//Видає елемент
            li.remove();//Видалення елементу
        }

        System.out.println("Мій ArrayList: " + al1);
    }
}