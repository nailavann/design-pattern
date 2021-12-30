package ornek_2;

public class Yüzbaşı implements Asker{
    String ad;
    int sicilNo;


    public Yüzbaşı(String ad, int sicilNo) {
        this.ad = ad;
        this.sicilNo = sicilNo;
    }

    @Override
    public void showDetails() {
        System.out.println("Yüzbaşı");
        System.out.println("Ad: " +ad);
        System.out.println("Sicil no: "+ sicilNo);
    }
}
