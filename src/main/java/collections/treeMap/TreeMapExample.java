package collections.treeMap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Double, Student> tm = new TreeMap<>(); //де Double - це середній бал
        Student st1 = new Student("Igor","Polupanov", 5);
        Student st2 = new Student("Artur","Azimov", 1);
        Student st3 = new Student("Sergyi","Gora", 2);
        Student st4 = new Student("Oksana","Nesterenko", 3);
        Student st5 = new Student("Inna","Hontar", 4);
        Student st6 = new Student("Mykyta","Som", 6);
        Student st7 = new Student("Ivan","Syrota", 5);

        tm.put(7.2, st1);
        tm.put(3.2, st2);
        tm.put(6.9, st3);
        tm.put(5.5, st4);
        tm.put(9.9, st5);
        tm.put(12.0, st6);
        tm.put(2.2, st7);

        System.out.println(tm);
       // System.out.println("The student wit key  9.9 is " + tm.get(9.9));
        tm.remove(2.2);
        System.out.println(tm);
        System.out.println(tm.descendingKeySet());//Відображення ключів DESC
        System.out.println(tm.descendingMap());//Видображення мапи всієї  ВУИС
        System.out.println(tm.tailMap(6.9));//Видображує рейнж елементів де ключ вище 6.9
        System.out.println(tm.headMap(6.9));//Видображує рейнж елементів де ключ нижче 6.9
        System.out.println(tm.lastEntry());//Перший елемент
        System.out.println(tm.firstEntry());//Останній елемент

//Давайте замість KEY поставимо об'єкт Student
        TreeMap<Student, Double> tm2 = new TreeMap<>();
        tm2.put(st1,12.0);
        tm2.put(st2,4.0);
        tm2.put(st3, 9.2);
        tm2.put(st4,11.3);
        System.out.println("Відсортований спісок tm2 is " + tm2);//--> Execution failed for task ':TreeMapExample.main()'.
        //> Process 'command '/Library/Java/JavaVirtualMachines/jdk-16.jdk/Contents/Home/bin/java'' finished with non-zero exit value 1 -
        //тому що в Studentне реализований інтерфейс Comparable який дозволяє сортувати - зробимо це




    }
}
