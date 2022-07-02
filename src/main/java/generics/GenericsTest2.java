package generics;

import java.util.ArrayList;

public class GenericsTest2 {
    public static void main(String[] args) {
        ArrayList <String> al = new ArrayList<>();
        al.add("Inna");
        al.add("Anna");
        al.add("Bella");
        al.add("Sonia");

      String s = GenMethod.getSecondElement(al);
        System.out.println(s);

        ArrayList <Integer> al1 = new ArrayList<>();
        al1.add(1);
        al1.add(22);
        al1.add(23);
        al1.add(24);

       Integer s1= GenMethod.getSecondElement(al1);
        System.out.println(s1);
    }

    //Problem with Method Overloading - JVMне бачиіт між ними різниці тому і підвреслює
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }

//    public void abc(Info<Integer> info){
//        Integer s = info.getValue();
//    }
}

class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}

class Parent {
    public void abc(Info<Integer> info) {
        Integer s = info.getValue();
    }
}

class Child extends Parent{

}

