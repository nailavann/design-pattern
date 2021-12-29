package ornek_2;

public class DaireBuilder implements EvBuilder{
    Ev ev = new Ev("Daire");
    @Override
    public void buildMalzeme() {
        ev.setMalzeme("tuğla");
    }

    @Override
    public void buildOda() {
        ev.setOda("4");
    }

    @Override
    public void buildKonum() {
        ev.setKonum("sincan");
    }

    @Override
    public void buildHavuz() {
        ev.setHavuz("havuz yok");
    }

    @Override
    public void buildGaraj() {
        ev.setGaraj("garaj yok");
    }

    @Override
    public Ev getEv() {
        return this.ev;
    }
}
