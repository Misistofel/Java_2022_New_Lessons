package primitiveVariables;

public class Primitives {
    public static void main(String[] args) {
        int a = 254;
        byte b = (byte) a;
        System.out.println(b);//-2

        int c = 255;
        float d = (float)c;
        float e = 15f;
        System.out.println(d);
        float j= 3.00f;
        int k = (int)j;
        System.out.println(k);
        char ab = 'a';
        Primitives p = new Primitives();
        p.example();

        double s = 256;
        double result1 = Math.sqrt(s);
        System.out.println("cтупінь= " + result1);

        byte bb = 0;
        byte bb1 = 1;
        boolean result2 = bb == bb1;
        boolean result3 = bb1 < bb;
        System.out.println("result 3= " + result3);

       final int X= 2;

        int y = 8;
        double result = 2*3;
        System.out.println(result);
    }

    public void example(){
        int cena = 10;
        System.out.println("Ціна = " + cena);

    }
}
