package ornek_2;

public class FordFactory implements SuperFactory{
    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }

    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }
}
