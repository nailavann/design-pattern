package ornek_2;

public class VillaBuilder implements EvBuilder{
    Ev ev = new Ev("Villa");
    @Override
    public void buildMalzeme() {
       ev.setMalzeme("beton");
    }

    @Override
    public void buildOda() {
        ev.setOda("10 oda");
    }

    @Override
    public void buildKonum() {
        ev.setKonum("çankaya");
    }

    @Override
    public void buildHavuz() {
        ev.setHavuz("30 m2 havuz");
    }

    @Override
    public void buildGaraj() {
        ev.setGaraj("garaj mevcut");
    }

    @Override
    public Ev getEv() {
        return this.ev;
    }
}
