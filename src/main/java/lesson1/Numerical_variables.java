package lesson1;
import java.lang.reflect.Array;

import static java.lang.Math.*;

public class Numerical_variables {
   String name;
   String surname;
   int age;

  public Numerical_variables(String name, String surname, int age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    System.out.println("Parent constructor!");
  }





 int [] arr = {3,6,9,11};
  public  void example(){
    for (int i = 0; i <arr.length ; i++) {
      if(arr[i]%3==0){

      }else {
        System.out.println("Це число не ділиться без остатку " + arr[i]);
      }
    }
  }

  public Numerical_variables() {
  }

  public static void main(String[] args) {
    Numerical_variables nv = new Numerical_variables();
    nv.example();

    int [] array = new int[10] ;
    array[2]= 2;

    System.out.println("Корінь з числа 16 = " + sqrt(16));
    System.out.println("ldf d lheujve cnegtyb = " + pow(2 , 2));
    System.out.println("Мінімум є " + min(4,14));

    int a = 3;
    int b = 5;
    long c = 100L;
    short d = 130;
    float e = 250.6f;
    double f = 1300.1;
    int g = 5;
    boolean j = d>=e;
    boolean k = j;
    boolean l = g==a;// = е присвоєння а == це рівність
    boolean m = 5<=6;
    boolean n = c!=d;
    String i = "Hello";
    String ii = " world!";

    System.out.println(i==ii);

    i = ii;
    //    System.out.println(i);
    //    System.out.println(i==ii);
    short w = 32767;

    long result = ++g - b + ++c - --a - d++;
    System.out.println(result);
    System.out.println(d);

    a = b;
    c = d;
    f=e;
    e = a;

    System.out.println(a);
    System.out.println(c);
    System.out.println(f);//чому тут не 250.6 а 250.60000610351562 ?
    System.out.println(e);
    System.out.println(j);
    System.out.println(g>=a);
    System.out.println(l);
    System.out.println(m);
    System.out.println(n);


  }
}