package OOP_Patterns.abstractFactory;

import collections.arrayList.Car;

public class Main {
    public static void main(String[] args) {
        CarFacory cf = new SlavutaFactory();
        cf.createCoupe();

    }
}
