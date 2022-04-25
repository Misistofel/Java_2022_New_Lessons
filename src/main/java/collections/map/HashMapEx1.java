package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(111111, "Anna Golovan");
        map1.put(111112, "Galyna Bondar");
        map1.put(111113, "Sergyi Ivanov");
        map1.put(111114, "Svyryd Vorohta");
        map1.put(111115, "Inna Polupan");
        map1.put(111116, "Olexandr Lytvyn");
        map1.put(null, "Maryna Mogyla");
        map1.put(null, "Maxym Baran");//If KEY is repeated so the previous key with same value are deleted!!!
//So (null, "Maryna Mogyla") was DELETED:
// {null=Maxym Baran, 111111=Anna Golovan, 111113=Sergyi Ivanov, 111112=Galyna Bondar,
// 111115=Inna Polupan, 111114=Svyryd Vorohta, 111116=Olexandr Lytvyn}

        //HashMap doesn't remember the ORDER os elements!!!
        System.out.println(map1);
        System.out.println(map1.get(111111));
        System.out.println(map1.size());
       // map1.remove(111112);
        System.out.println(map1.size());
//putIfAbsent - add new key-value if it doesn't exist
        map1.putIfAbsent(111116, "OOOO KKK");// already exist so was not added
        System.out.println(map1);
        map1.remove(111116);
        System.out.println(map1);
        System.out.println("If  Inna Polupan is contains in map1 ? " +map1.containsValue("Inna Polupan"));
        System.out.println("If  111110 is contains in map1 ? " +map1.containsKey(111110));
        System.out.println("Map key: " + map1.keySet());
        System.out.println("Map values are: " + map1.values());


    }
}
