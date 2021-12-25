package ornek_2;

public class MercedesFactory implements SuperFactory{
    @Override
    public Coupe createCoupe() {
        return new MercedesCoupe();
    }

    @Override
    public Sedan createSedan() {
        return new MercedesSedan();
    }
}
