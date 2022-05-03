package comparatorInterface;

import java.util.Comparator;

class MySort implements Comparator< Employee > {

// // In order to sort Employee by their salary in ascending order, we need to change MySort class with the following changes:
    @Override
    public int compare(Employee o1, Employee o2) {
        return (int)(o1.getSalary() - o2.getSalary());
    }

}
