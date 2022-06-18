package OOP_Patterns.abstractFactory;

public class ToyotaFactory implements CarFacory{

    @Override
    public Sedan createSedan() {
        return new ToyotaSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new ToyotaCoupe();
    }
}
