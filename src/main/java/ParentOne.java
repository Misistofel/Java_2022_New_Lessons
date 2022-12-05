public class ParentOne {
    String name;
    private int salary;

    public ParentOne(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void parentMethod (){
        System.out.println("Parent mathod!");
    }


    public static void main(String[] args) {


        String s1 = new String("Hello");
        String s2 = "Hello";
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
    @Override
    public String toString() {
        return "ParentOne{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';


    }
}
