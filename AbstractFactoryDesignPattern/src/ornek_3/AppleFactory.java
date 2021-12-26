package ornek_3;

public class AppleFactory implements BaseFactory{
    @Override
    public Telephone createTelephone() {
        return new AppleTelephone();
    }

    @Override
    public Tablets createTablets() {
        return new AppleTablets();
    }
}
