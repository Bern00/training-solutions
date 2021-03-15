package week07d05;

public class Vehicle {

    protected int getNumberOfGears;
    protected TransmissionType getTransmissionType;

    public Vehicle() {
        this.getNumberOfGears = 5;
        this.getTransmissionType = TransmissionType.MANUAL;
    }

    public int getGetNumberOfGears() {
        return getNumberOfGears;
    }

    public TransmissionType getGetTransmissionType() {
        return getTransmissionType;
    }
}
