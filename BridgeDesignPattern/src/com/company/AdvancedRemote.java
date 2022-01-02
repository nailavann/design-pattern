package com.company;

public class AdvancedRemote extends Remote{

    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute()
    {
        System.out.println("Advanced Remote Mute");
        device.setVolume(0);
    }

}
