package com.company;

public class Main {

    public static void main(String[] args) {
        //2 FARKLI CİHAZI YÖNETMEK İÇİN TEK BİR KUMANDA OLUŞTURUP BU KUMANDA ÜZERİNDEN
        //2 FARKLI CİHAZI YÖNETEBİLİYORUZ
        //SOYUTLAMA VE UYGULAMA
        testDevice(new TV());
        System.out.println();
    }

    public static void testDevice(Device device)
    {
        System.out.println("Basic remote");
        Remote basicRemote=new Remote(device);
        basicRemote.togglePower(); // offsa on oldu **** onsa off oldu
        basicRemote.channeUp(); //kanal 1 arttı
        basicRemote.volumeUp(); // volume 10 arttı
        device.printStatus();

        System.out.println();

        System.out.println("Advanced Remote");
        AdvancedRemote advancedRemote=new AdvancedRemote(device);
        advancedRemote.togglePower(); //offsa on oldu **** onsa off oldu
        advancedRemote.mute();
        device.printStatus();
    }
}
