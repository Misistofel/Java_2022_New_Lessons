package collections.linkedHashMap;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {

        LinkedHashMap<Double, Student> lhm = new LinkedHashMap<>(16,0.75f, true);

        collections.linkedHashMap.Student st1 = new collections.linkedHashMap.Student("Igor","Polupanov", 5);
        collections.linkedHashMap.Student st2 = new collections.linkedHashMap.Student("Artur","Azimov", 1);
        collections.linkedHashMap.Student st3 = new collections.linkedHashMap.Student("Sergyi","Gora", 2);
        collections.linkedHashMap.Student st4 = new collections.linkedHashMap.Student("Oksana","Nesterenko", 3);

        lhm.put(7.2,st1);
        lhm.put(7.5,st2);
        lhm.put(5.8,st3);
        lhm.put(6.4,st4);
        System.out.println(lhm);

        System.out.println(lhm.get(7.5));
        System.out.println(lhm.get(7.2));
        //Тепер буде інший порядок де 7.2 - буде на останньому місці а 7.5 - на передостанньому
        System.out.println(lhm);

    }
}
