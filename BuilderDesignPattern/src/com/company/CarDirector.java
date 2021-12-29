package com.company;

public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public void build(){
        carBuilder.buildBodyStyle();
        carBuilder.buildEngine();
        carBuilder.buildBreaks();
        carBuilder.buildPower();
        carBuilder.buildSeats();
        carBuilder.buildFurelType();
        carBuilder.buildWindows();
    }
}
