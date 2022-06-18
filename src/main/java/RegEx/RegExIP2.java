package RegEx;

import java.util.Arrays;

public class RegExIP2 {

    static String s1 = "My IP address is 182.25.91.05 and 183.25.91.06";

    public static void main(String[] args) {
        String[] array = s1.split(" ");
        // System.out.println("This is SPLIT method: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}" +
                    "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)")) {
                System.out.println("FINALLY RESULT: " + array[i]);
            }
        }
    }
}
