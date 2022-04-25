package collections.arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car car0 = new Car();
        Car car1 = new Car();
        Car car2 = new Car();

        ArrayList <Car> carList = new ArrayList<Car>();
        carList.add(car0);
        carList.add(car1);
        carList.add(car2);
        System.out.println("carList: "+ carList.toString());


        ArrayList  list = new ArrayList();
        ArrayList <Car> list1 = new ArrayList<>(50);//найвірніший// варіант
        ArrayList <Car> list2 = new ArrayList<>(list1);
        ArrayList<Car>list3 = new ArrayList();


        ArrayList <String> listS = new ArrayList<>();
        listS.add("Marina");
        listS.add(", Happy ");
        listS.add("Easter !");
        for(String s: listS){
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(listS.get(0));
        listS.add(0, "Hi! ");

        for(String s: listS){
            System.out.print(s + " ");
        }
        //System.out.println(listS.get(10));
        System.out.println(listS.set(1,"MASHA "));
        for(String s: listS){
            System.out.print(s + " ");
        }

        System.out.println("Виделано елемент? " + listS.remove("Hi! "));
        for(String s: listS){
            System.out.print(s + " ");
        }
        System.out.println("Видплено елемент " + listS.remove(0));
        for(String s: listS){
            System.out.print(s + " ");
        }
        System.out.println();
        listS.add(0, "Oksana ");

        for(String s: listS){
            System.out.println(s + " ");
        }

        listS.set(0, "Dima ");
        for(String s: listS){
            System.out.print(s + " ");
        }
        ArrayList <String> listD = new ArrayList();
        listD.add("Is anubody home?");
        for(String d: listD){
            System.out.print(d + " ");
        }
        System.out.println();
        listD.addAll(1, listS);
        for(String d: listD){
            System.out.print(d + " ");
        }
        ArrayList <String> listT = new ArrayList();
        listT.add("Thanls a lot! ");

        listD.addAll(listT);
        for(String t: listT){
            System.out.print(t + " ");
        }
        System.out.println();
//        listT.clear();
//        System.out.println("listT:");
//        for(String t: listT){
//            System.out.print( t);
//        }
        System.out.println();
        System.out.println(listD.get(1));
        System.out.println(listD.size());
        listD.add("Dima ");
        System.out.println(listD);
        System.out.println(listD.lastIndexOf("Dima "));
        System.out.println(listD.indexOf("Dima "));
        System.out.println(listD.isEmpty());
        System.out.println(listD.contains("Dima "));
        System.out.println(listD.toString());



      //  System.out.println("Index of element 'Is anubody home?' is: " + listT.indexOf("Is anubody home? Dima  , Happy  Easter ! Thanls a lot!"));


    }
}
