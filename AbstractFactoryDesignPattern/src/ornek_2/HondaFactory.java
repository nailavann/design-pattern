package ornek_2;

public class HondaFactory implements SuperFactory{
    @Override
    public Coupe createCoupe() {
        return new HondaCoupe();
    }

    @Override
    public Sedan createSedan() {
        return new HondaSedan();
    }
}
