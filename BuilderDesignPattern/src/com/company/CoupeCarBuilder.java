package com.company;

public class CoupeCarBuilder implements CarBuilder{
    private final Car car = new Car("Coupe");
    @Override
    public void buildBodyStyle() {
        car.setBodyStyle("spor 2 kapılı");
    }

    @Override
    public void buildPower() {
        car.setPower("400");
    }

    @Override
    public void buildEngine() {
        car.setEgine("3.0");
    }

    @Override
    public void buildBreaks() {
        car.setBreaks("100mm fren");
    }

    @Override
    public void buildSeats() {
        car.setSeats("2 koltuk");
    }

    @Override
    public void buildWindows() {
        car.setWindows("2 cam");
    }

    @Override
    public void buildFurelType() {
        car.setFuelType("benzin");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
