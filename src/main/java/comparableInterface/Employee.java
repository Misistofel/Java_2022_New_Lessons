package comparableInterface;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;
    boolean married;

    public Employee(int id, String name, String surname, int salary, boolean married) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.married = married;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", married=" + married +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        } else if (this.id < anotherEmp.id) {
            return -1;
        } else {
            return 1;
        }
    }

//    //Or we can do it like this
//    @Override
//    public int compareTo(Employee anotherEmp) {
//        return this.id - anotherEmp.id;
//    }

    //to sort by String name:
//    @Override
//    public int compareTo(Employee anotherEmp) {
//     return this.name.compareTo(anotherEmp.name);
//        }

    //to sort by String name: if names are equal - sort by surname
//    @Override
//    public int compareTo(Employee anotherEmp) {
//        int result = this.name.compareTo(anotherEmp.name);
//        if (result == 0) {
//            result = this.surname.compareTo(anotherEmp.surname);
//        } return result;
//    }

    //to sort by boolean - sort by married
    //Порівнюємо boolean
//Створюємо проміжні змінні, в які будемо сетапити числа, замість буліанів.
//Витягуєм значення boolean з нашого класу. (this.getBoolValue())
//Якщо значення рівне true, то присвоюємо змінній 1. В іншому випадку, присвоюємо 0.
//Порівнюємо конвертовані значення як int.
//    @Override
//    public int compareTo(@NotNull MyObject other) {
//        int b1 = this.getBoolValue() ? 1 : 0;
//        int b2 = other.getBoolValue() ? 1 : 0;
//        return b2 - b1;
//    }
}


