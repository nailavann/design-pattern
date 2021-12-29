package com.company;

public class MySQLCsvConnection extends ConnectionTemplate{
    @Override
    public void setDBDriver() {
        System.out.println("MySQL driveri kuruldu");
    }

    @Override
    public void setUserLogin() {
        System.out.println("MySQL user bilgileri girildi");
    }

    @Override
    public void setData() {
        System.out.println("Csv'den veri okundu...");
    }
}
