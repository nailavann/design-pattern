package com.company;

public class OracleTxtConnection extends ConnectionTemplate{
    @Override
    public void setDBDriver() {
        System.out.println("Oracle driver kuruldu");
    }

    @Override
    public void setUserLogin() {
        System.out.println("Oracle user bilgileri girildi");
    }

    @Override
    public void setData() {
        System.out.println("Txt'den veri okundu...");
    }
}
