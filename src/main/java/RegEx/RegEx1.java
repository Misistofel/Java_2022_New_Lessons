package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx1 {
    public static void main(String[] args) {
//        String s1 = "ABCD ABCE ABCFABCGABCH";
//        Pattern pattern1 = Pattern.compile("ABC");

        //Перевіримо чи вираз закінчується на "6abch"
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("6abch$");

        //Перевіримо чи вираз починається на "abcd"
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("^abcd");   //Position 0 abcd

        //Будь-який символ можна замінити точкою
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("abc.");

        //Будь-який символ можна замінити точкою
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("[0-9]");
// Відповідь:
//        5
//        Position 13 5
//        6
//        Position 18 6
//Вивести лише цифри:
//        String s1 = "abcd abce abc5abcg6abch";
//        Pattern pattern1 = Pattern.compile("\\d");

        //Вивести все окрім цифер в тому числі символи та пробіли
//        String s1 = "abcd abce abc5abcG6abch";
//        Pattern pattern1 = Pattern.compile("\\D");

        //Вивести всі букви
//        String s1 = "abcd abce abc5abcG6abch";
//        Pattern pattern1 = Pattern.compile("[a-z]");

//Вивести букви та цифриб рижнє підкруслювання але не пробіли
        //Варіант1
//        String s1 = "abcd abce abc5abcG6abch";
//        Pattern pattern1 = Pattern.compile("\\w");
//        //Варіант2
//        String s1 = "abcd abce abc5abcG6abch";
//        Pattern pattern1 = Pattern.compile("[A-Za_z_]");


        //Знайти всі слова у виразі
        String s1 = "Hi, hi we're your weather girls\n" +
                "Ah-huh\n" +
                "And have we got news for you\n" +
                "You better listen\n" +
                "Get ready, all you lonely girls";

        Pattern pattern1 = Pattern.compile("\\w+");

        Matcher matcher = pattern1.matcher(s1);
        while (matcher.find()){
            System.out.println(matcher.group());
            //Щоб дізнатися на якій позиції знаходиться ABCD
            System.out.println("Position " + matcher.start() + " "+ matcher.group());
        }



    }
}
