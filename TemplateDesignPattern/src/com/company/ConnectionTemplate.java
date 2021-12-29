package com.company;

public abstract class ConnectionTemplate {
    public final void run(){
        setDBDriver();
        setUserLogin();
        connect();
        prepareStatement();
        setData();
        insert();
        close();
        destroy();
    }


    public abstract void setDBDriver();
    public abstract  void setUserLogin();
    public abstract void setData();

    private void connect()
    {
        System.out.println("Veri tabanı bağlantısı kuruluyor");
    }

    private void prepareStatement()
    {
        System.out.println("Sorgu oluşturuluyor");
    }

    private void insert()
    {
        System.out.println("Veriler giriliyor");
    }
    private void close()
    {
        System.out.println("Bağlantı kapatılıyor");
    }

    private void destroy()
    {
        System.out.println("Bağlantı nesneleri yok ediliyor");
    }
}
