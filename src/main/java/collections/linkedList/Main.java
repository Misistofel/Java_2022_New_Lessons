package collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    //гарно використовувати коли треба добавляти та видаляти з середини списку
    //тут набагато більше методів
    public static void main(String[] args) {

        Person person1 = new Person("Masha", "Horobec", 15);
        Person person2 = new Person("Nina", "Horobec", 25);
        Person person3 = new Person("Stepan", "Horobec", 19);
        Person person4 = new Person("Anna", "Horobec", 16);

        LinkedList<Person> list = new LinkedList<>();
        list.add(person1);
        list.add(person2);
        list.add(1,person3);

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println( "LinkedList consist of: ");
        Iterator <Person> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }

        System.out.println("ЗАДАЧА №2 ");
        String str1 = new String("Привiт!");
        String str2 = new String("Мене звуть Антон ");
        String str3 = new String("Я не люблю Джаву ");
        String str4 = new String("Я люблю  джава-скрипт ");

        LinkedList<String> ll = new LinkedList<>();
        ll.add(str1);
        ll.add(str3);
        System.out.println(ll);
        ll.add(1, str2);
        System.out.println(ll);
        ll.remove(1);
        System.out.println(ll);

        ll.addLast(str4);
        ll.addFirst(str2);
        System.out.println(ll);
//Вернуты першый/останний елемент зи спыску легкл
        System.out.println(ll.peekFirst());
        System.out.println(ll.peekLast());
//Выдалыты першый та останний елемент зи списку
        System.out.println(ll.pollFirst());
        System.out.println(ll.pollLast());
        System.out.println(ll);
        System.out.println(ll.size());

//повернуты з Ll - звычайный масыв array
//        Array[] ar = ll.toArray(new Array[2]);
//        System.out.println(ar.toString());-??????????????????

    }
}
