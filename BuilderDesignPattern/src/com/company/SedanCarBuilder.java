package com.company;

public class SedanCarBuilder implements CarBuilder{

    Car car = new Car("Sedan");
    @Override
    public void buildBodyStyle() {
        car.setBodyStyle("sedan 4 kapı");
    }

    @Override
    public void buildPower() {
        car.setPower("156 hp");
    }

    @Override
    public void buildEngine() {
        car.setEgine("2.0");
    }

    @Override
    public void buildBreaks() {
        car.setBreaks("300 mm fren");
    }

    @Override
    public void buildSeats() {
        car.setSeats("4 koltuk");
    }

    @Override
    public void buildWindows() {
        car.setWindows("4 pencere");

    }

    @Override
    public void buildFurelType() {
        car.setFuelType("Dizel");

    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
