package exm;

public class Employee implements Comparable<Employee>{
    String name;
    String surname;
    int salary;

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee anotherEmp) {
        if(this.salary == anotherEmp.salary){
            return 0;
        }else if(this.salary > anotherEmp.salary){
            return 1;
        }else{
            return -1;
        }
    }


}
