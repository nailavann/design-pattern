package com.company;

import ornek_2.Coffee;
import ornek_2.GreenTea;
import ornek_2.PrepareDrink;
import ornek_2.Tea;

public class Main {

    public static void main(String[] args) {

        //ORNEK 1

        ConnectionTemplate MySQLCsv = new MySQLCsvConnection();
        MySQLCsv.run();

        System.out.println("------------------------");

        ConnectionTemplate OracleTxt = new OracleTxtConnection();
        OracleTxt.run();

        System.out.println("ÖRNEK 1 BİTİŞ!!!!!!!");
        System.out.println("*********************");
        System.out.println();




        //ORNEK 2
        PrepareDrink cay = new Tea();
        cay.hazirla();

        System.out.println("--------");

        PrepareDrink kahve = new Coffee();
        kahve.hazirla();

        System.out.println("---------");

        PrepareDrink yesilCay = new GreenTea();
        yesilCay.hazirla();
    }
}
