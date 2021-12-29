package ornek_2;

public class Ev {
    private String malzeme;
    private String oda;
    private String konum;
    private String havuz;
    private String garaj;
    private String evTipi;


    public Ev(String evTipi) {
        this.evTipi = evTipi;
    }

    public void evBilgi(){
        System.out.println("Ev tipi: " + this.evTipi);
        System.out.println(this.malzeme);
        System.out.println(this.oda);
        System.out.println(this.konum);
        System.out.println(this.havuz);
        System.out.println(this.garaj);
    }

    public String getMalzeme() {
        return malzeme;
    }

    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }

    public String getOda() {
        return oda;
    }

    public void setOda(String oda) {
        this.oda = oda;
    }

    public String getKonum() {
        return konum;
    }

    public void setKonum(String konum) {
        this.konum = konum;
    }

    public String getHavuz() {
        return havuz;
    }

    public void setHavuz(String havuz) {
        this.havuz = havuz;
    }

    public String getGaraj() {
        return garaj;
    }

    public void setGaraj(String garaj) {
        this.garaj = garaj;
    }
}
