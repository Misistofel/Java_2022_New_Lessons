package collections.setHashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        HashSet<Student> set1 = new HashSet<>();

        collections.setHashSet.Student st1 = new collections.setHashSet.Student("Igor","Polupanov", 5);
        collections.setHashSet.Student st2 = new collections.setHashSet.Student("Artur","Azimov", 1);
        collections.setHashSet.Student st3 = new collections.setHashSet.Student("Sergyi","Gora", 2);

        set1.add(st1);
        set1.add(st2);
        set1.add(st3);
        set1.add(st1);

        System.out.println(set1);
//
//        set.add("Zara");
//        set.add("Oleg");
//        set.add("Marina");
//        set.add("Igor");
//
//        System.out.println(set);
//        //Додамо дублікат
//        set.add("Igor");// дублікати не додаються
//        set.add(null);
//
//        System.out.println(set);
//
//        set.remove("Zara");
//        System.out.println(set);
//
//        System.out.println(set.size());
//        System.out.println(set.isEmpty());
//        System.out.println(set.contains("Misha"));




    }
}
