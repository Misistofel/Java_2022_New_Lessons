import static java.lang.String.valueOf;

public class MainTr {
    protected void give(){

    }
    public static void main(String[] args) {
        int i = 1;
        byte b = 1;
        char a = 'a';

        String s;
        double d = 1.05;
        String str = valueOf(d);

        String value1 ="a";
        String value2 =new String("a");
        System.out.println(value1.equals(value2));
        System.out.println(value1==value2);

        


    }
}
