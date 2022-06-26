package lesson1;

import java.util.*;

public class NumericalChild extends Numerical_variables{
    public NumericalChild(String name, String surname, int age) {
        super(name, surname, age);
        System.out.println("Child constructor!");


    }
}
class MainN{
    public static void main(String[] args) {
        NumericalChild num = new NumericalChild("Margo", "T",45);

    }
}

class AllAboutFinal{
   // public final  String START ;

//    public AllAboutFinal() {
//        START = "OI";
//    }

    String name;
    int age;
    public final int getAge(){
        int result = age;
        return age;
    }
}

//class childAllAboutFinal extends AllAboutFinal{
//    public int getAge(){ // Не можна оверрайдити бо метод final
//
//    }
//}

class Student{
    String name;
    int cource;
    static int count;

    public Student() {
    }

    public Student(String name, int cource) {
        count++;
        this.name = name;
        this.cource = cource;
        System.out.println("Student #" + count + " is created!");
    }
    static void method(){
        System.out.println("This is static method!");
        Student s = new Student();
        String name1 = s.name;
    }

}
class MainClass{
    public static void main(String[] args) {

        Student s1= new Student("Olena", 1);
        Student s2 = new Student("Irena", 2);
        Student s3 = new Student("Nadiia", 5);
        Student.method();

      String s11 = "Poka";
      String s12 = new String("Poka");
      String s13 = new String("Poka");
        System.out.println("TRUE or FALSE?");
        System.out.println(s12==s13 );
        System.out.println(s11 == s12);
      int i = s11.length();
        System.out.println(i);
        String s14 = s13;
        System.out.println(s14 == s13);//true
        System.out.println(s14.equals(s14));//true
        System.out.println(s11.equals(s12));//true
        System.out.println(s11==s12);

        String n = " Hi dear colleagues! ";
        String m = n.trim();
        System.out.println("EXPRESSION IS_" +m +"_");
        String l = m.replace("Hi", "Buy");
        System.out.println(l);
        String name = "METRO";
        String name1 = name.toLowerCase(Locale.ROOT);
        System.out.println(name1);

        int az =Integer.parseInt("5");
        byte ay = Byte.parseByte("12");
        System.out.println(ay);
        String v ="7";


        int o = Integer.parseInt ("67");
        System.out.println(o);

        String d = "99";
        int dd = Integer.parseInt(d);
        System.out.println(dd);

        String e = "100";
        int ee = Integer.parseInt(e);
        System.out.println(ee);

        int f = 22;
        String ff = f+"";
        System.out.println(ff);

        ArrayList <String> al_1 = new ArrayList<>();
        al_1.add("Maryna");
        al_1.add("Mariia");
        al_1.add("Deliz");
        al_1.add("Dima");

        ArrayList <String> al_2 = new ArrayList<>();
        al_2.add("Maryna");
        al_2.add("Mariia");
        al_2.add("Deliz");
        al_2.add("Dima");
        //System.out.println(al_2);
        Iterator<String> it = al_1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

            Map <Integer , String > map1 = new HashMap<>();
            String month = "Mar";
            switch(month){
                case "Dec":
                case "Jan":
                case "Feb":
                    System.out.println("Winter");
                    break;
                case "Mar":
                case "Apr":
                case "May":
                    System.out.println("Spring");
//                    break;
                case "Jun":
                case "Jul":
                case "Aug":
                    System.out.println("Summer");
            }

         Map <Integer, String> map3 = new HashMap<>();
            map3.put(1000,"Ira");
            map3.put(1001,null);
            map3.put(1002,"Natali");
            map3.put(1003,"Ira");
            map3.put(1004,"Oksana");
            System.out.println(map3);
        }









    }
}

class Carr{
    String color;
    String motor;
    int doorNumber;

    public Carr(String color, String motor, int doorNumber) {
        this.color = color;
        this.motor = motor;
        this.doorNumber = doorNumber;
    }
}

class CarrTest{
    //Carr c = new Carr("Red", "TM", 2);
    public void changeDoorNumber(Carr c, int n){
        c.doorNumber = n;
    }

    public void chandeColorOfDoors(Carr c1, Carr c2){
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }
}

class Main13{
    public static void main(String[] args) {
        Carr c = new Carr("Red", "TM", 2);
        Carr cc = new Carr("White", "TAAS", 4);
        CarrTest ct = new CarrTest();
        ct.changeDoorNumber(c,6);
        System.out.println("NUMBER OF DOORS ARE " + c.doorNumber);
        ct.chandeColorOfDoors(c, cc);
        System.out.println("CAR C color = " + c.color);
        System.out.println("CAR CC color = " +cc.color);

    }
}




