package collections.arrayList;

import java.util.ArrayList;

public class ArrayToArrayList {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car();
        Car c3 = new Car();
//toArray метод
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1);
        arrayList.add(c2);
        arrayList.add(c3);
        Object[] array = arrayList.toArray();
        for(Object o: array){
            System.out.println(o);
        }
        array.toString();
        //toArray(DataType [] array) метод
//ще є метод asList що переводить Array v List
    }
}