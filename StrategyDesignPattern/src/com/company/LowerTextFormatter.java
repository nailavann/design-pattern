package com.company;

public class LowerTextFormatter implements TextFormatter{
    @Override
    public void format(String text) {
        System.out.println("Lower: "+text.toLowerCase());
    }
}
