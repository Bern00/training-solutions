package introinheritance.basket;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String barcode) {

        Item toBeRemoved = null;

        for(int i = 0; i < items.size(); i++) {
            if(items.get(i).getBarcode().equals(barcode)) {
                toBeRemoved = items.get(i);
            }
        }

        items.remove(toBeRemoved);
    }

    public void clearBasket() {
        items.clear();
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }
}
