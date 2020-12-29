package algorithmsmax.sales;

import java.util.List;

public class SalespersonWithFurthestAboveTargetSelector {

    public Salesperson aboveTargetSelector(List<Salesperson> salespersonList) {
        Salesperson salesperson = null;
        for(Salesperson sl: salespersonList) {
            if(salesperson == null || (sl.getDifferenceFromTarget() > 0 && sl.getDifferenceFromTarget() > salesperson.getDifferenceFromTarget())) {
                salesperson = sl;
            }
        }
        return salesperson;
    }
}
