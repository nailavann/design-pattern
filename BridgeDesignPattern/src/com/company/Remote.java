package com.company;

public class Remote {
    public Device device;

    public Remote(Device device) {
        this.device = device;
    }
    public void togglePower() {
        System.out.println("Toggle Powe");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    public void volumeDown() {
        System.out.println("Volume Down");
        device.setVolume(device.getVolume() - 10);
    }

    public void volumeUp() {
        System.out.println("Volume Up");
        device.setVolume(device.getVolume() + 10);
    }

    public void channeUp() {
        System.out.println("Channel Up");
        device.setChannel(device.getChannel() + 1);
    }

    public void channeDown() {
        System.out.println("Channel Down");
        device.setChannel(device.getChannel() - 1);
    }
}
