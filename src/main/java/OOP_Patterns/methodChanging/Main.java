package OOP_Patterns.methodChanging;

public class Main {
    public static void main(String[] args) {
        //Моя задача - отримати 6
        MarinaNumber myNumber = new MarinaNumber(1);
        myNumber.add(5)
                .add(10)
                .print();

    }
}
