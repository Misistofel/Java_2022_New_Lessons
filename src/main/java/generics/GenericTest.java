package generics;

public class GenericTest {
    public static void main(String[] args) {
Info<String> info1 = new Info<>("Hello!");
        System.out.println(info1);
        String s = info1.getValue();
        System.out.println(s);

        Info<Integer> info2 = new Info<>(567);
        System.out.println(info2);
        Integer s2 = info2.getValue();
        System.out.println(s2);

    }
}

class Info<T>{
    private  T value;
    //constructor

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "({"+ value + "})";
    }
    public T getValue(){
        return value;
    }
}