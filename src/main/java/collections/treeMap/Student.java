package collections.treeMap;

public class Student implements Comparable<Student>
{
    String name;
    String surname;
    int cource;

    public Student(String name, String surname, int cource) {
        this.name = name;
        this.surname = surname;
        this.cource = cource;
    }


    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cource=" + cource +
                '}';
    }
}
