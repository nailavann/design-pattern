package com.company;

import ornek_2.IShape;
import ornek_2.ShapeFactory;

public class Main {

    public static void main(String[] args) {

        /*                  ÖRNEK 1               */

        //FABRİKAYI ÇAĞIRIYORUZ
        PlanFactory planFactory = new PlanFactory();
        Plan plan;

        //1 sayısına atadığımız domestic plan'ı çadegğırıyoruz
        plan = planFactory.getPlan(1);
        plan.getRate();
        plan.calculateBill(10);

        System.out.println("***********************");


        //2 sayısına atadığımız connercial plan'ı çağırıyoruz
        plan = planFactory.getPlan(2);
        plan.getRate();
        plan.calculateBill(10);


        System.out.println("************************");

        //3 sayısına atadığımız institutional plan'ı çağırıyoruz

        plan = planFactory.getPlan(3);
        plan.getRate();
        plan.calculateBill(10);

        System.out.println("********************");


        System.out.println("Kısa şekilde yazımı !");

        printPlan(planFactory.getPlan(1),10);
        printPlan(planFactory.getPlan(2),10);
        printPlan(planFactory.getPlan(3),10);


        System.out.println("ÖRNEK 1 BİTTİ !!!!!!!!!");
        System.out.println();


        /*                  ÖRNEK 2               */

        //FABRİKAYI ÇAĞIRIYORUZ
        ShapeFactory shapeFactory = new ShapeFactory();
        IShape shape;

        //1 sayısına atadığımız dikdörtgeni çağırdık
        shape = shapeFactory.getShape(1);
        shape.draw();

        //2 sayısına atadığımız daireyi çağırdık
        shape = shapeFactory.getShape(2);
        shape.draw();

        //3 sayısına atadığımız kareyi çağırdık
        shape = shapeFactory.getShape(3);
        shape.draw();

        System.out.println();
        System.out.println("Kısa yazım!");
        System.out.println();
        printShape(shapeFactory.getShape(1));
        printShape(shapeFactory.getShape(2));
        printShape(shapeFactory.getShape(3));



    }


    public static void printPlan(Plan p, int amount){
        p.getRate();
        p.calculateBill(amount);
    }

    public static void printShape(IShape shape){
        shape.draw();
    }
}
