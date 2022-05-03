package comparatorInterface;

import java.util.Comparator;

public class MySort2 implements Comparator <Employee> {

    // In order to sort Employee by their salary in descending order, we need to change MySort class with the following changes:
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o2.getSalary() - o1.getSalary());
    }
}
