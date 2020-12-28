package algorithmssum.sales;

import java.util.ArrayList;
import java.util.List;


public class SalesAmountSumCalculator {

    List<Salesperson> totalSales = new ArrayList<>();

    public int sumSales(List<Salesperson> totalSales) {
        int sum = 0;
        for(Salesperson salesperson: totalSales) {
            sum += salesperson.getAmount();
        }
        return sum;
    }
}
