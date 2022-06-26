package OOP_Patterns.methodChanging;

public class MarinaNumber {
    private  int number;

    public MarinaNumber(int number) {
        this.number = number;
    }

    public MarinaNumber add(int toAdd){
        number += toAdd;
        return this;
    }
    public  void print(){
        System.out.println(number);
    }
}
