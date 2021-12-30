package com.company;

import ornek_2.Albay;
import ornek_2.AskerDirector;
import ornek_2.Yarbay;
import ornek_2.Yüzbaşı;

public class Main {

    public static void main(String[] args) {

        //ORNEK 1
        Developer d1=new Developer("Taner Kaya", 1058,"Junior Deveoper");
        Developer d2=new Developer("Ramazan Kaya", 1059, "Senior Develper");
        Manager m1 = new Manager("asdasd",59,"qeqwer");

        CompanyDirector companyDirector = new CompanyDirector();

        companyDirector.addEmployee(d1);
        companyDirector.addEmployee(d2);
        companyDirector.addEmployee(m1);

        companyDirector.showEmployeeDetails();


        System.out.println();
        System.out.println("-----------------------------");
        System.out.println();

        //ORNEK 2

        Albay albay1 = new Albay("FSGLSFG",123123);
        Yarbay yarbay1 = new Yarbay("dkafgg", 123);

        AskerDirector askerDirector = new AskerDirector();

        askerDirector.addAsker(albay1);
        askerDirector.addAsker(yarbay1);
        askerDirector.addAsker(new Yüzbaşı("kdgamgad",103));

        askerDirector.showDetails();

    }


}
