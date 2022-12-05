package exm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Masha", "Trufel", 350);
        Employee emp2 = new Employee("Sasha", "Jovtiannikova", 40);
        Employee emp3 = new Employee("Misha", "Kabanec", 450);
        List el = new ArrayList<>();
        el.add(emp1);
        el.add(emp2);
        el.add(emp3);
        System.out.println("Before sorting: " + el);
        Collections.sort(el);
        System.out.println("After sorting: " + el);

    }
}
