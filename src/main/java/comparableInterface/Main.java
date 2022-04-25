package comparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> listOfEmployee = new ArrayList<>();

        Employee em1 = new Employee(3, "Kateryna", "Suprun", 5000, true);
        Employee em2 = new Employee(1, "Sergyi", "Korotun", 6000, false);
        Employee em3 = new Employee(2, "Mariia", "Viter", 7000, false);
        Employee em4 = new Employee(4, "Mariia", "Shulga", 8000, true);

        listOfEmployee.add(em1);
        listOfEmployee.add(em2);
        listOfEmployee.add(em3);
        listOfEmployee.add(em4);

        System.out.println("Before sorting \n" + listOfEmployee);
        Collections.sort(listOfEmployee);
        System.out.println("After sorting \n" + listOfEmployee);

    }
}
