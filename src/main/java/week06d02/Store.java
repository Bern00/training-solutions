package week06d02;

import java.util.ArrayList;
import java.util.List;

public class Store {

    List<Product> products;

    public Store(List<Product> products) {
        this.products = products;
    }

    public int getProductByCategoryName(String category){
        int result = 0;
        for(Product p: products){
            if(p.getCategory().equals(category)){
                result++;
            }
        }
        return result;
    }
}
