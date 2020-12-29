package algorithmsmax.sales;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.MIN_VALUE;

public class SalesAmountMaxSelector {

    public List<String> maxRevenueName (List<Salesperson> salespeople) {

        List<String> maxRevenueNameList = new ArrayList<>();
        int maxAmount = MIN_VALUE;

        for(Salesperson sp: salespeople) {
            if(sp.getAmount() > maxAmount) {
                    maxAmount = sp.getAmount();
            }
        }

        for(Salesperson sp: salespeople) {
            if(sp.getAmount() == maxAmount) {
                maxRevenueNameList.add(sp.getName());
            }
        }

        return maxRevenueNameList;
    }
}
