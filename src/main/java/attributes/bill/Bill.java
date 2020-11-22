package attributes.bill;

import java.util.ArrayList;
import java.util.List;

public class Bill {

    List<Item> items = new ArrayList<>();


    public  void addItem(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for(Item item: items) {
            double tetel = item.getQuantity() * item.getPrice();
            totalPrice = totalPrice + tetel;
        }
        return totalPrice;
    }
}
