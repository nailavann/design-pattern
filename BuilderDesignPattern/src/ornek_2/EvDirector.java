package ornek_2;

public class EvDirector {
    private EvBuilder evBuilder;

    public EvDirector(EvBuilder evBuilder) {
        this.evBuilder = evBuilder;
    }

    public void build(){
        evBuilder.buildGaraj();
        evBuilder.buildHavuz();
        evBuilder.buildKonum();
        evBuilder.buildOda();
        evBuilder.buildMalzeme();
    }
}
