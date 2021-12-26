package ornek_3;

public class SamsungFactory implements BaseFactory{
    @Override
    public Telephone createTelephone() {
        return new SamsungTelephone();
    }

    @Override
    public Tablets createTablets() {
        return new SamsungTablets();
    }
}
