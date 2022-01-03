package com.company;

public class RunWay implements Command{
    private IKule kuleMediator;

    public RunWay(IKule kuleMediator) {
        this.kuleMediator = kuleMediator;
    }

    @Override
    public void land() {
        System.out.println("Runway is available for landing");
        kuleMediator.setAvailabileStatusRunWay(true);
    }
}
