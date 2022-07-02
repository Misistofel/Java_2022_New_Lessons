package abstr;

public class RealizeAbstract extends Adbsrt {
    public void getAllParameters() {
        System.out.println("This is NOT abstract method!");
    }

    public static void simpleMethod() {
        System.out.println("Simple static  method!");
    }

    @Override
    void abstrMethod() {

    }

    public void subdivide(double a, double b) {
        try {
            double result = a / b;
        } catch (Exception e) {
            System.out.println("Exception!!!");
        }
    }
}