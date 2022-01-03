package com.company;

public class UpperTextFormatter implements TextFormatter{
    @Override
    public void format(String text) {
        System.out.println("Upper: "+text.toUpperCase());

    }
}
