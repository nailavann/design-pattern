package com.company;

public class Car {
    private String bodyStyle;
    private String power;
    private String egine;
    private String breaks;
    private String seats;
    private String windows;
    private String fuelType;
    private String carType;

    public Car(String carType) {
        this.carType=carType;
    }

    public String getBodyStyle() {
        return bodyStyle;
    }

    public void setBodyStyle(String bodyStyle) {
        this.bodyStyle = bodyStyle;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getEgine() {
        return egine;
    }

    public void setEgine(String egine) {
        this.egine = egine;
    }

    public String getBreaks() {
        return breaks;
    }

    public void setBreaks(String breaks) {
        this.breaks = breaks;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public String getWindows() {
        return windows;
    }

    public void setWindows(String windows) {
        this.windows = windows;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void info()
    {
        System.out.println(this.bodyStyle);
        System.out.println(this.power);
        System.out.println(this.egine);
        System.out.println(this.breaks);
        System.out.println(this.windows);
        System.out.println(this.seats);
        System.out.println(this.fuelType);

    }
}
