package streams;

import java.util.ArrayList;
import java.util.List;

public class StreamTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Privet");
        list.add("Jak sprav?");
        list.add("OK");
        list.add("POka");

        for (int i = 0; i <list.size() ; i++) {
            list.set( i, String.valueOf(list.get(i).length()));
        }

        System.out.println(list);
    }
}