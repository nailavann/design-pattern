package com.company;

public class TV implements Device{
    private boolean on=false;
    private int volume=10;
    private int channel=1;

    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on=true;
    }

    @Override
    public void disable() {
        on=false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        if(percent>50)
        {
            volume=50;
        }
        else if(percent<0)
        {
            volume=0;
        }
        else
        {
            volume=percent;
        }
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel=channel;
    }

    @Override
    public void printStatus() {

        System.out.println("Televizyon");
        System.out.println("Status:"+on);
        System.out.println("Kanal:"+channel);
        System.out.println("Ses:"+volume);

    }
}
