package methodstructure.pendrive;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void risePrice(int percent) {
        setPrice(this.price * (1 + percent / 100));
    }

    public int comparePricePerCapacity(Pendrive pendrive) {

        int pendriveRate = 0;
        int rateNumberActual = pendrive.getPrice() / pendrive.getCapacity();
        int rateNumberOther = price / capacity;

        if(rateNumberActual > rateNumberOther) {
            pendriveRate = 1;
        }
        if(rateNumberActual < rateNumberOther) {
            pendriveRate = -1;
        }

        return pendriveRate;
    }

    public boolean cheaperThan(Pendrive pendrive) {
        return this.price < pendrive.price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
