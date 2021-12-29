package com.company;

public class SingletonEager {

    //çabuk aceleci ilk başta direk tanımlanır
    private static SingletonEager instance = new SingletonEager();

    private SingletonEager() {
    }


    public static SingletonEager getInstance(){
        return instance;
    }

    public void testMethod(){
        System.out.println("SingletonEager method denemeTest");
    }


}
