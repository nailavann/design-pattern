package com.company;

import ornek_2.*;


public class Main {

    public static void main(String[] args) {
        //ORNEK 1
        String text = "Nail Emre Avan" ;
        TextFormatter lowerFormatter = new LowerTextFormatter();
          TextEditor textEditor = new TextEditor(lowerFormatter);  //editöre hangi formatta olacağını söylüyoruz


        textEditor.publishText(text);


        TextFormatter upperFormatter = new UpperTextFormatter();
        textEditor = new TextEditor(upperFormatter);

        textEditor.publishText(text);

        System.out.println("--------------------------------");


        //ORNEK 2

        Operation toplama = new Toplama();
        OperationEditor editor = new OperationEditor(toplama);
        editor.calculateResult(5,3);

        Operation carpma = new Carpma();
        editor = new OperationEditor(carpma);
        editor.calculateResult(6.5,6.5);



    }
}
