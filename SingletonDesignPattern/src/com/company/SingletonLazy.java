package com.company;

public class SingletonLazy {
    private static SingletonLazy singletonLazy;

    private SingletonLazy() {
    }

    public synchronized static SingletonLazy getInstance(){
        if(singletonLazy == null){
            singletonLazy = new SingletonLazy();
        }
        return singletonLazy;
    }

    public void testMethod(){
        System.out.println("Singleton designpattern ile deneme method!");
    }

}
