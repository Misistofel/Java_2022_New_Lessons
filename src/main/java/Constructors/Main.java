package Constructors;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int salary = 1500;
//        if (salary >= 500) {
//            System.out.println("Salary is perfect!");
//        } else if (salary < 400 && salary > 300) {
//            System.out.println("Salary is good!");
//        } else if (salary <= 300) {
//            System.out.println("Salary is small");
//        }

        String month = "January";
        switch (month) {
            case "January":
                System.out.println("1 month!");
                break;
            case "February":
                System.out.println("2 month");
                break;
            case "March":
                System.out.println("3 month");
                break;
            default:
                System.out.println("What is it?");
        }

        for (int i = 0; i <11 ; i++) {
            if(i == 7) {
                continue;
            }else if(i % 10 == 0 ) {

                System.out.println(i);
            }
        }

        System.out.println(" ------------------ ");
        int i = 0;
        do {
            i++;
            System.out.println(i + " ");

        } while (i<5);


        System.out.println(" ------------------ ");
        for (int j = 5; j > 0 ; j--) {
            System.out.println(j + " ");
        }

        System.out.println(" ------------------ ");
        int a = 3;
        for (int k = 1; k < 9; k++) {
            int value = a*k;
            System.out.println(a + " " + "*" + " " + k +" " + "=" + value);

        }
        System.out.println(" ------------------ ");
        System.out.println("Input any pozitive number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int l = 1; l <= n; l++) {
            sum = sum+ l;
            System.out.println(sum);
            
        }


        }

    }
