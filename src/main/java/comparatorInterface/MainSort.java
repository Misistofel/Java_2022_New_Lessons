package comparatorInterface;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainSort {

    public static void main(String[] args) {

        List < Employee > employees = new ArrayList < Employee > ();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "Santosh", 29, 350000));
        employees.add(new Employee(30, "Sanjay", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));

        // ascending order
        Collections.sort(employees, new MySort());
        System.out.println("Sorted ASC by Salary" + employees);
//
//        // descending order
        Collections.sort(employees, new MySort2());

        System.out.println("Sorted DESC by Salary" +employees);

        Collections.sort(employees);
    }
}
