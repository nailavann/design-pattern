package com.company;

public class Main {

    public static void main(String[] args) {
	GUIFactory guiFactory;
    Button button;
    Checkbox checkbox;

    guiFactory = new UbuntuFactory();
    button = guiFactory.createButton();
    checkbox = guiFactory.createCheckBox();

    button.paint();
    checkbox.paint();
    }
}
