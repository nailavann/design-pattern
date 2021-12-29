package com.company;

public class Student {
    private static Student instance;

    private String ad,soyad,okulAdi,cinsiyet;

    private Student() {
    }


    public synchronized static Student getInstance(){
        if(instance == null){
            instance = new Student();
        }
        return instance;
    }

    public void ogrenciyiTanit(){
        System.out.println(ad +  " " +soyad +" "+ okulAdi +" "+ cinsiyet);
    }

    public void ogrenciDerseGir(){
        System.out.println(ad + " isimli öğrenci derse giriyor!");
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getOkulAdi() {
        return okulAdi;
    }

    public void setOkulAdi(String okulAdi) {
        this.okulAdi = okulAdi;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    @Override
    public String toString() {
        return "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", okulAdi='" + okulAdi + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' ;
    }
}
