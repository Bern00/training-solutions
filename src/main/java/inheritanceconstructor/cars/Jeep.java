package inheritanceconstructor.cars;

public class Jeep extends Car {

    private double extraCapacity;
    private double extraFuel;


    public Jeep(double fuelRate, double fuel, double tankCapacity, double extraCapacity, double extraFuel) {
        super(fuelRate, fuel, tankCapacity);
        if (extraFuel > extraCapacity) {
            throw new IllegalArgumentException("Auxiliary capacity is less than extra fuel!");
        }
        this.extraCapacity = extraCapacity;
        this.extraFuel = extraFuel;
    }

    public double getExtraCapacity() {
        return extraCapacity;
    }

    public double getExtraFuel() {
        return extraFuel;
    }

    public void drive(int km) {
        double number = km * super.getFuelRate() / 100;

        if(number > super.getFuel() + extraFuel) {
            throw new RuntimeException("Not enough fuel available!");
        }

        if (number > extraFuel) {
            super.modifyFuelAmount(extraFuel - number);
            extraFuel = 0;
        } else {
            extraFuel -= number;
        }

    }

    public double calculateRefillAmount() {
        return (super.getTankCapacity() + extraCapacity) - (super.getFuel() + extraFuel);
    }


}
