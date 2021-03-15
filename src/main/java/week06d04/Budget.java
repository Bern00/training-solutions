package week06d04;

import java.util.ArrayList;
import java.util.List;

public class Budget {

    List<Item> items;

    public Budget(List<Item> items) {
        this.items = items;
    }

    public List<Item> getItemsByMonth(int month) {

        if(month > 12 || month < 1){
            throw new IllegalArgumentException();
        }
        List<Item> result = new ArrayList<>();

        for(Item i: items){
            if(i.getMonth() == month){
                result.add(i);
            }
        }
        return result;
   }

}
