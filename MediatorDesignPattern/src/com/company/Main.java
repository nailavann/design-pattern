package com.company;

public class Main {

    public static void main(String[] args) {


        Kule kule = new Kule();
        //bu kule ile çalışıcaz
        RunWay runWay = new RunWay(kule);
        Flight flight = new Flight(kule);

        kule.registerRunWay(runWay);
        kule.registerFlight(flight);

        Flight flight2 = new Flight(kule);
        kule.registerFlight(flight2);

      flight2.readyToLand();
      flight.land();
      flight2.land();


    }
}
