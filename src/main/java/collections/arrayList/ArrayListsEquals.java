package collections.arrayList;

import java.util.ArrayList;

public class ArrayListsEquals {
    public static void main(String[] args) {

        ArrayList<Car> al1 = new ArrayList();
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();

        ArrayList<Car> al2 = al1;
        System.out.println(al1.equals(al2));  //true
//Два ArrayList-a рахуються рівними якщо вони містять однакові елементи - тут враховуєтья і порядок елементів
        ArrayList<Car> al3 = new ArrayList();
        al3.add(c1);
        al3.add(c2);
        al3.add(c2);

        System.out.println(al1.equals(al3)); //false

    }
}