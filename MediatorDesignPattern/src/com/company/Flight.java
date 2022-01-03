package com.company;

public class Flight implements Command{

    private IKule kuleMediator;

    public Flight(IKule kuleMediator) {
        this.kuleMediator = kuleMediator;
    }


    @Override
    public void land() {

        if(kuleMediator.isAvaliableRunWay())
        {
            System.out.println("Landed successfully !!!");
            kuleMediator.setAvailabileStatusRunWay(false);
        }
        else
        {
            System.out.println("Waiting for runway !!!");
        }
    }
    public void readyToLand()
    {
        System.out.println("Landing started !!!");
    }

    public void parked()
    {
        System.out.println("Flight is parked");
        kuleMediator.setAvailabileStatusRunWay(true);
    }
}
