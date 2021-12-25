package com.company;

public class UbuntuFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new UbuntuButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new UbuntuCheckbox();
    }
}
