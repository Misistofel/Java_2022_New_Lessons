package Constructors;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;


    public Employee(int id, String surname, int age, double salary, String department1) {
        this(id, surname, age,salary);
        department = department1;

    }

    public Employee(int id, String surname, int age, double salary) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    public double doubleRiseSalary(){
        double newSalary = this.salary * 2;
        return newSalary;
    }



    }

