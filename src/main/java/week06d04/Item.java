package week06d04;

public class Item {

    private int price;
    private int month;
    private String name;

    public Item(int price, int month, String name) {
        if(month > 12 || month < 1){
            throw new IllegalArgumentException();
        }
        this.price = price;
        this.month = month;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public int getMonth() {
        return month;
    }

    public String getName() {
        return name;
    }
}
