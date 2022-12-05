import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Objects;

public class ChildOne extends ParentOne{
    int age;

    public ChildOne(String name, int salary, int age) {
        super(name, salary);
        this.age = age;
    }

    @Override
    public void parentMethod (){
        System.out.println("ChildOne mathod!");
    }

    public int parentMethod (int a){
        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChildOne childOne = (ChildOne) o;
        return age == childOne.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    void abc() throws FileNotFoundException {
        File f = new File("");
        FileInputStream fis = new FileInputStream(f);
    }

    void def()  {
        System.out.println("This is method def");
        try {
            abc();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
