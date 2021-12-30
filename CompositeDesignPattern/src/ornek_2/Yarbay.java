package ornek_2;

public class Yarbay implements Asker{

    String ad;
    int sicilNo;


    public Yarbay(String ad, int sicilNo) {
        this.ad = ad;
        this.sicilNo = sicilNo;
    }

    @Override
    public void showDetails() {
        System.out.println("Yarbay");
        System.out.println("Ad: " + ad);
        System.out.println("Sicil no: " + sicilNo);
    }
}
