package comparatorInterface;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MainSort {

    public static void main(String[] args) {

        List < Employee > employees = new ArrayList < Employee > ();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "Santosh", 29, 350000));
        employees.add(new Employee(30, "Sanjay", 31, 400000));
        employees.add(new Employee(40, "Pramod", 29, 500000));

        // ascending order
//        Collections.sort(employees, new MySort());
//        System.out.println("Sorted ASC by Salary" + employees);
//
//        List<Employee> sorted = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).toList();
//        for(int i=0; i<sorted.size(); i++){
//            System.out.println(sorted.get(i));
//        }
//КРУТЕ сортування спочатку по salaryа потім по AGeякщо селері однакові
        List<Employee> sortedAge = employees.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getAge)).toList();
        for(int i=0; i<sortedAge.size(); i++){
            System.out.println(sortedAge.get(i));
        }

                //.toList();

//        // descending order
//        Collections.sort(employees, new MySort2());
//
//        System.out.println("Sorted DESC by Salary" +employees);
//
//        Collections.sort(employees);
    }
}
