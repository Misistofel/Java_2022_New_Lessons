package RegEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExIP {

    void checkIP(String ip){
        String regex = "((25[0-5]|2[0-4]\\d|[01]?\\d?\\d)(\\.)){3}"+
                "(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)";

        //   це 25[0-5] - число від 250 до 255
        //  це 2[0-4]\\d - це число від 20 до 24 та число від 0 до 9
        //d|[01]?\d?\d)(\.) - це 0 фба 1 - може бути але можк і не бути бо ?
        // далі якась цифра від 0 до 9 (може бути а може  і не бути)
        //  і наприкінці має бути цифра від 0 до 9 - тобто від 0 до 199
        System.out.println(ip + "is OK? " + Pattern.matches(regex, ip));

    }
    public static void main(String[] args) {
        //0-255.0-255.0-255.0-255
        String ip1 = "255.38.192.99";
        String ip2 = "182.262.91.05";

        RegExIP regExip = new RegExIP();
        regExip.checkIP(ip1);
        regExip.checkIP(ip2);


    }
}
