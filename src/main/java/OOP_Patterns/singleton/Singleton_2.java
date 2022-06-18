package OOP_Patterns.singleton;

public class Singleton_2 {
    //Потокобезпечне рішення, модифікатор synchronized робиіт метод синхронним  - в один момент часу викрнується лише в одному потоці
    private Singleton_2() {
        System.out.println("This is Singleton constructor");
    }
    private  static Singleton_2 s = null;

    public static synchronized Singleton_2 getS(){
        if (s==null){
            s=new Singleton_2();
        } return s;
    }

    public static void main(String[] args) {
        Singleton_2 s1 = Singleton_2.getS();
        Singleton_2 s2 = Singleton_2.getS();
        System.out.println(s1);
        System.out.println(s2); //Виведе одне й те саме посилання як для s1 так і для s2
        //але спочатку вивкде конструктор Singleton - причому лише один раз
    }
}
