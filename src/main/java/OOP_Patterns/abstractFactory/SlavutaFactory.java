package OOP_Patterns.abstractFactory;

import collections.arrayList.Car;

public class SlavutaFactory implements CarFacory {
    @Override
    public Sedan createSedan() {
        return new SlavutaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new SlavutaCoupe();
    }
}
