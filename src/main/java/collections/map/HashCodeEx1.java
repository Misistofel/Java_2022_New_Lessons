package collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashCodeEx1 {
    public static void main(String[] args) {

        Map<Student, Double> map = new HashMap<>();//  <Student and average mark>
        Student st1 = new Student("Margo", "Glumova", 1);
        Student st2 = new Student("Ihor", "Sikorsky", 2);
        Student st3 = new Student("MIvan", "Piddubnyi", 3);
        Student st4 = new Student("Margo", "Glumova", 1);

        map.put(st1, 4.4);
        map.put(st2, 5.0);
        map.put(st3, 3.9);
        //lets add clon of st1---> st4
        map.put(st4, 5.0);
        //check if itmap contains st4 now
        boolean result = map.containsKey(st4);
        System.out.println("Result = " + result);// FALSE - why?
        System.out.println(st1.equals(st4));// TRUE: st1 equal st4!!!
        //We need to add method HashCode to Student- did it

        System.out.println(st1.hashCode());//-2085817015
        System.out.println(st2.hashCode());//271342490




    }
}
