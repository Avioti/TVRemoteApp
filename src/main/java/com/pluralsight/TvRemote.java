package com.pluralsight;

public class TvRemote {
    private String manufacturerName;
    private int currentChannel, currentVolume;

    private boolean power;

    public boolean turnOn(){
        System.out.println("Turning TV on...");
        return true;
    }

    public boolean turnOff(){
        System.out.println("Turning TV off....");
        return false;
    }

    public int changeChannel(int newChannel){
        System.out.println("Changing to " + newChannel);
        return newChannel;
    }

    public int adjustVolume(int volume){
        System.out.println("Adjusting volume to " + this.currentChannel);
        return volume;
    }

    public String isPower() {
        String Yes = "";
        if(this.power == true){
            Yes = "ON";
        }else {
            Yes = "OFF";
        }
        return Yes;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public int getCurrentChannel() {

        return currentChannel;
    }

    public void getStatus(){
        System.out.println("Updated Status: " + isPower() + ", " + this.currentChannel + ", " + "Volume: " + getCurrentVolume());
    }

    public TvRemote(String manufacturerName, int currentChannel, int currentVolume, boolean power) {
        this.manufacturerName = manufacturerName;
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
        this.power = power;
    }



    public void phoner(TvRemote remote){
        System.out.println("=== Using the Bedroom TvRemote ===");
        remote.turnOn();
        remote.changeChannel(8);
        System.out.println("Now watching " + remote.currentChannel);
        System.out.println("Volume: " + remote.adjustVolume(12));
        remote.changeChannel(3);
        System.out.println("Now watching " + remote.currentChannel);
        remote.changeChannel(99);
        System.out.println("Now watching " + remote.currentChannel);
        System.out.println();

        remote.getStatus();
    }

    public void publicChannel(TvRemote test){
        if( test.getCurrentChannel() == 3){
            System.out.println("Channel 3: Cartoon Network");
        } else if ( test.getCurrentChannel() == 5){
            System.out.println("Channel 5: Discovery Channel");
        }else if ( test.getCurrentChannel() == 8){
            System.out.println("Channel 8: Food Network");
        }else if ( test.getCurrentChannel() == 13){
            System.out.println("Channel 13: HGTV");
        }else if ( test.getCurrentChannel() == 25){
            System.out.println("Channel 25: Comedy Central");
        } else{
            System.out.println("Channel " + test.getCurrentChannel() + " Unknown Channel");
        }

    }

}
