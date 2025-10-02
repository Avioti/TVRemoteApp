package com.pluralsight;

public class App {
    public static void main(String[] args) {
        TvRemote Samsung = new TvRemote("Samsung", 25, 25, false);
        TvRemote Lg = new TvRemote("LG", 45, 100, true);

        System.out.println("=== TV Remote Control System ===");

        System.out.println("Living Room TVRemote (" + Samsung.getManufacturerName() + ")");
        System.out.println("Status: "+ Samsung.isPower() + ", (" + Samsung.getCurrentChannel() + "), " + "Volume: " + Samsung.getCurrentVolume() );
        System.out.println();
        System.out.println("BedRoom TVRemote (" + Lg.getManufacturerName() + ")");
        System.out.println("Status: "+ Lg.isPower() + ", (" + Lg.getCurrentChannel() + "), " + "Volume: " +  Lg.getCurrentVolume() );
        System.out.println();


        System.out.println("=== Using the Living room TvRemote ===");
        Samsung.turnOn();
        Samsung.changeChannel(25);
        System.out.println("Now watching ");
        System.out.println("Volume: " + Samsung.adjustVolume(15));
        System.out.println();

        Samsung.getStatus();

        System.out.println();





        Lg.phoner(Lg);





    }



}
