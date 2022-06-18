package OOP_Patterns.builderPattern;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor.Builder()
                .withName("Jane")
                .withSurname("Doe")
                .withAge(32)
                .withHeight(165)
                .withWeight(70)
                .build();
    }
}
