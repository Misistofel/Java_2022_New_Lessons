package abstr;

public abstract class Adbsrt {
    int a;
    String name;

    public Adbsrt() {
    }

    public Adbsrt(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public void getAllParameters() {
        System.out.println("This is NOT abstract method!");
    }
        public static void simpleMethod(){
            System.out.println("Simple static  method!");
        }

    abstract void abstrMethod();

    }

