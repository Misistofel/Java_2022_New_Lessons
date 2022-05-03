package collections.setHashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("Zara");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");

        System.out.println(set);
        //Додамо дублікат
        set.add("Igor");// дублікати не додаються
        set.add(null);

        System.out.println(set);

        set.remove("Zara");
        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Misha"));




    }
}
