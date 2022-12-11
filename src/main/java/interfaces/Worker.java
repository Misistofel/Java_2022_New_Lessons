package interfaces;

public class Worker implements Sweamable{
    String name;
    String Surname;
    int age;
    String profession;

    public Worker(String name, String surname, int age, String profession) {
        this.name = name;
        Surname = surname;
        this.age = age;
        this.profession = profession;
    }

    @Override
    public void swim() {
        System.out.println("Worker is able to sweam!");
    }
}
