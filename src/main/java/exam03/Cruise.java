package exam03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cruise {

    private Boat boat;
    private LocalDate sailing;
    private double basicPrice;
    private List<Passenger> passengers;

    public Cruise(Boat boat, LocalDate sailing, double basicPrice) {
        this.boat = boat;
        this.sailing = sailing;
        this.basicPrice = basicPrice;
    }

    public void bookPassenger(Passenger passenger) {
        if(passengers.size() <= boat.getMaxPassengers())
                passengers.add(passenger);
    }

    public double getPriceForPassenger(Passenger passenger) {
        return passenger.getCruiseClass().getMultiplier() * basicPrice;
    }

    public Passenger findPassengerByName(String name) {
        for(Passenger passenger:passengers) {
            if(passenger.getName().equals(name)) {
                return passenger;
            }
        }
        return null;
    }

    public List<String> getPassengerNamesOrdered() {
        List<String> passengerNames = new ArrayList<>();
        for(Passenger passenger: passengers) {
            passengerNames.add(passenger.getName());
        }
        Collections.sort(passengerNames);
        return passengerNames;
    }

    public double sumAllBookingsCharged() {
        double sum = 0;
        for(Passenger passenger: passengers) {
            sum += getPriceForPassenger(passenger);
        }
        return sum;
    }
}
