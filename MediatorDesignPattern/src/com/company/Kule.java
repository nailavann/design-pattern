package com.company;

public class Kule implements IKule{
    private RunWay runway;
    private Flight flight;
    private boolean  avaliable=true;

    @Override
    public void registerFlight(Flight flight) {
        this.flight=flight;
    }

    @Override
    public void registerRunWay(RunWay runWay) {
        this.runway=runWay;
    }

    @Override
    public void setAvailabileStatusRunWay(boolean status) {
        this.avaliable=status;
    }

    @Override
    public boolean isAvaliableRunWay() {
        return this.avaliable;
    }
}
