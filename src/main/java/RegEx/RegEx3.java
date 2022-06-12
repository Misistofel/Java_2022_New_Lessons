package RegEx;

import java.util.Arrays;

public class RegEx3 {
    public static void main(String[] args) {
        String s1 = "Hi, hi we're your agro@cc.ua weather girls Ah-huh And have we got margo@cc.com  news for you You better listen Get ready, all you lonely girls 5";
        String s2 = "agro@cc.ua";
        String s3 = "Get ready, all you lonely girls 5";
        boolean result = s2.matches("\\w+@\\w+\\.(com|ua)");
        System.out.println(result);

        String [] array = s1.split(" ");
        System.out.println("This is SPLIT method: " + Arrays.toString(array));
            for (int i = 0; i < array.length; i++) {
               if( array[i].matches("\\w+@\\w+\\.(com|ua)")){
                    System.out.println("FINALLY RESULT: " + array[i]);
                }
            }


    }
}
