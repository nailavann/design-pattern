package com.company;

import ornek_2.*;

public class Main {

    public static void main(String[] args) {

        //ORNEK 1

        CarBuilder carBuilder = new SedanCarBuilder();
        CarDirector carDirector = new CarDirector(carBuilder);

        Car car = carBuilder.getCar();

        carDirector.build();
        car.info();


        System.out.println("----------------------");

        CarBuilder carBuilder2 = new CoupeCarBuilder();
        CarDirector carDirector2 = new CarDirector(carBuilder2);

        Car car2 = carBuilder2.getCar();

        carDirector2.build();
        car2.info();

        System.out.println("ÖRNEK 1 BİTİŞ");

        System.out.println();
        System.out.println("***********************");
        System.out.println();

        //ORNEK 2

        EvBuilder villaBuilder = new VillaBuilder();
        EvDirector evDirector = new EvDirector(villaBuilder);

        Ev villa = villaBuilder.getEv();
        evDirector.build();
        villa.evBilgi();

        System.out.println("*********");

        EvBuilder daireBuilder = new DaireBuilder();
        evDirector = new EvDirector(daireBuilder);

        Ev daire = daireBuilder.getEv();

        evDirector.build();
        daire.evBilgi();




    }
}
