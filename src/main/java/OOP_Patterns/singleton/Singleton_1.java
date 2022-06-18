package OOP_Patterns.singleton;

public class Singleton_1 {
    //Потокобезпечне рішення,
    private Singleton_1() {
        System.out.println("This is Singleton constructor");
    }
    private  final static Singleton_1 s = new Singleton_1();

    public static Singleton_1 getS() {
        return s;
    }

    public static void main(String[] args) {
        Singleton_1 s1 = Singleton_1.getS();
        Singleton_1 s2 = Singleton_1.getS();
        System.out.println(s1);
        System.out.println(s2); //Виведе одне й те саме посилання як для s1 так і для s2
        //але спочатку вивкде конструктор Singleton - причому лише один раз
    }
}
