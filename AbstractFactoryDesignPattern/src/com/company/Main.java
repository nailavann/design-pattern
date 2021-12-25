package com.company;

import ornek_2.*;

public class Main {

    public static void main(String[] args) {
        /* Factory'den alt sınıfları istiyorduk.Burada fabrika istiyoruz.Factory'de fabrikadan veri/sınıf üretmesini
        * isterken burada bir üste çıkıyoruz bu sınıfları üretmek için bir fabrika üret diyoruz.Birden fazla fabrikamız
        * olacak.Farklı farklı ürün grupları üretmek için farklı farklı abstract factory'ler olacak.
        * (Factory Design'da bir factory var.O fabrika yalnızca birbirleyirle ilişkili olan sınıflardan nesne üretmemizi
        * sağlıyor.) */


                          /*               ÖRNEK 1        */

	GUIFactory guiFactory;
    Button button;
    Checkbox checkbox;

    guiFactory = new UbuntuFactory();
    button = guiFactory.createButton();
    checkbox = guiFactory.createCheckBox();

    button.paint();
    checkbox.paint();


    System.out.println();

    guiFactory = new MacFactory();
    button = guiFactory.createButton();
    checkbox = guiFactory.createCheckBox();

    button.paint();
    checkbox.paint();

    System.out.println();

    System.out.println("Örnek 1 bitiş!");

    System.out.println();
    System.out.println("-------------------------");


                   /*               ÖRNEK 2       */


        //ana fabrikayı tanımlıyoruz
        SuperFactory superFactory;

        Coupe coupe;
        Sedan sedan;

        //ana fabrikayı honda fabrikasından çağırıyoruz
        superFactory = new HondaFactory();
        coupe = superFactory.createCoupe();
        sedan = superFactory.createSedan();

        coupe.produceCar();
        sedan.produceCar();


        System.out.println();

        superFactory = new FordFactory();
        coupe = superFactory.createCoupe();
        sedan = superFactory.createSedan();

        coupe.produceCar();
        sedan.produceCar();


        System.out.println();

        superFactory = new MercedesFactory();
        coupe = superFactory.createCoupe();
        sedan = superFactory.createSedan();

        coupe.produceCar();
        sedan.produceCar();




    }
}
