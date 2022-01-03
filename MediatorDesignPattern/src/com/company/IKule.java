package com.company;

public interface IKule {
    void  registerFlight(Flight flight);
    void registerRunWay(RunWay runWay);
    void setAvailabileStatusRunWay(boolean status);
    boolean isAvaliableRunWay();
}
