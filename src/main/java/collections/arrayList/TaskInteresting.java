package collections.arrayList;

import java.util.ArrayList;

public class TaskInteresting {
    public static void main(String[] args) {
        ArrayList <String> students = new ArrayList<>();
        students.add(1, "Bondar");
        students.add(2, "Gora");
        students.add(3, "Tyn");
        students.remove(2);
        for(String s: students){
            System.out.println(s + " ");
        }
//Видасть помилку, при створенні листа  його довжина = 0, тому ми не можемо додати на першу позицію елемент - буде Exception!

    }
}
