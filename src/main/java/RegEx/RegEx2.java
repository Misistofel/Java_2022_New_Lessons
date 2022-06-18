package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {
    public static void main(String[] args) {
        String s1 = "Hi, hi we're your weather girls\n" +
                "Ah-huh\n" +
                "And have we got news for you\n" +
                "You better listen\n" +
                "Get ready, all you lonely girls 5";

       Pattern p1 = Pattern.compile("\\w+");

       Matcher m = p1.matcher(s1);
       while(m.find()){
           System.out.println(m.group());
       }

        System.out.println("Find all the numbers! ");

        //Знайти всі числаб щоскладаються з 2-х цифер та  які є окремо від слів
        String s2 = "Hi, hi  18 we're your weather girls\n" +
                "Ah-huh\n" +
                "And have we 19  got news for you\n" +
                "4You better listen\n" +
                "Get ready, 20 all you lonely girls 21767";

        Pattern p2 = Pattern.compile("\\b\\d{2}\\b");
        Matcher matcher2 = p2.matcher(s2);
        while(matcher2.find()){
            System.out.println( matcher2.group());
        }
        //Вивести дев'ятизначні числа що пос=чинаються на плюс
        System.out.println("Find all the 9-digits numbers which start with '+' ! ");
        String s3 = "Hi, hi  181111111 we're your weather girls" +
                "Ah-huh" +
                "And have we 192222222  got news for you" +
                "4You better listen" +
                "Get ready, 203333333 all you lonely girls 21767";

    Pattern p3 = Pattern.compile("\\+\\d{9}");
    Matcher m3 = p3.matcher(s3);
    while(m3.find()){
        System.out.println(m3.group());
    }

        //Вивести шаблон для email
        System.out.println("EMAIL template: ");
        String s4 = "Hi, hi  masha@cvex.com we're your weather girls" +
                "Ah-huh" +
                "And have we ira@gmail.com  got news for you" +
                "4You better listen" +
                "Get ready, tygr@nix.ua all you lonely girls 21767";

        Pattern p4 = Pattern.compile("\\w+@\\w+\\.(com|ua)+");
        Matcher m4 = p4.matcher(s4);
        while(m4.find()){
            System.out.println(m4.group());
        }


        //Вивести все після =
        System.out.println("Print all after symboll = ");
        String s5 = "the weight = thirty nine kilo 3";

        //Pattern p6 = Pattern.compile("=(.+\\w?)");
        Pattern p6 = Pattern.compile("=(.+)");
       // Pattern p6 = Pattern.compile("=(\b(\\w|\\d|\\s?))");
        Matcher m5 = p6.matcher(s5);
        while(m5.find()){
            System.out.println(m5.group());
        }

//        int [] array = {2,5,11};
//        for (int a:array) {
//            System.out.println(a);
//        }
//
//        int i =5;
//        String b = String.valueOf((i));

    }
}

