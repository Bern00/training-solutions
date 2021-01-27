package isahasa.fleet;

public class Liner implements CanCarryPassengers, Ship {

    private final CanCarryPassengers canCarryPassengers;

    public Liner(int maxPassengers) {
        canCarryPassengers = new CanCarryPassengersBehaviour(maxPassengers);
    }

    @Override
    public int loadPassenger(int passengers) {
        return canCarryPassengers.loadPassenger(passengers);
    }

    @Override
    public int getPassengers() {
        return canCarryPassengers.getPassengers();
    }
}
