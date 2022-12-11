package interfaces;

public class Teacher extends  Worker implements Sweamable{

    public Teacher(String name, String surname, int age, String profession) {
        super(name, surname, age, profession);
    }

    @Override
    public void swim() {
        System.out.println("The teacher is able to swim");
    }
}
