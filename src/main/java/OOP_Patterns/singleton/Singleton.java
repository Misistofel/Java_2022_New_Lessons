package OOP_Patterns.singleton;

public class Singleton {
    //Потоконебезпечне рішення, боя кщо одночасно запустили в паралель 2 потоки, які викличуть getS, перевірять умову ,що
    //немає жлдного екземпляру класуSingletonі одночасно викличуть конструктор--> буде створено 2 екземпляри класу!!
    private Singleton() {
        System.out.println("This is Singleton constructor");
    }
    private  static Singleton s = null;

    public static Singleton getS(){
        if (s==null){
            s=new Singleton();
        } return s;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getS();
        Singleton s2 = Singleton.getS();
        System.out.println(s1);
        System.out.println(s2); //Виведе одне й те саме посилання як для s1 так і для s2
        //але спочатку вивкде конструктор Singleton - причому лише один раз
    }
}
