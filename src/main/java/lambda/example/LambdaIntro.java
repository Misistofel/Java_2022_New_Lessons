package lambda.example;

public class LambdaIntro {
    public static void main(String[] args) {
        Isum is = new Isum() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        //А можна було просто записати все в один рядок з лямбдою
        Isum isum = (a , b) -> a+b;
    }
}
