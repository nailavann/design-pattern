package ornek_2;

public abstract  class PrepareDrink {

    public void hazirla(){
        kettleSuKoy();
        suKaynat();
        suyuBardagaDok();
        bardakIcecekKoy();
    }


    private void kettleSuKoy(){
        System.out.println("Kettle'a su koyuldu!");
    }

    private void suKaynat(){
        System.out.println("Su kaynıyor!");
    }
    private void suyuBardagaDok(){
        System.out.println("Su bardağa dökülüyor!");
    }
    public abstract void bardakIcecekKoy();
}
