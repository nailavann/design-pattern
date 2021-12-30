package ornek_2;

public class Albay implements Asker{

    String ad;
    int sicilNo;


    public Albay(String ad, int sicilNo) {
        this.ad = ad;
        this.sicilNo = sicilNo;
    }
    @Override
    public void showDetails() {
        System.out.println("Albay");
        System.out.println("Ad: " + ad);
        System.out.println("Sicil no: "+ sicilNo);
    }
}
