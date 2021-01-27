package isahasa.fleet;

public class CanCarryPassengersBehaviour implements CanCarryPassengers {

    private int passengers;
    private final int maxPassengers;

    public CanCarryPassengersBehaviour(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public int loadPassenger(int passengers) {
        int reminder = 0;
        if(maxPassengers > passengers) {
            this.passengers = passengers;
        } else {
            this.passengers = maxPassengers;
            reminder = passengers - maxPassengers;
        }

        return reminder;
    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
