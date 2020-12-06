package enumtype.unit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class UnitConverter {

    public BigDecimal convert(BigDecimal length, LengthUnit source, LengthUnit target) {
       double szam = length.doubleValue() * source.getInMILIMETER() / target.getInMILIMETER();
       return BigDecimal.valueOf(Math.round(szam));

    }

    public List<LengthUnit> siUnits() {
        List<LengthUnit> siList = new ArrayList<>();
        for(LengthUnit siL: LengthUnit.values()) {
            if(siL.isSi() == true) {
                siList.add(siL);
            }
        }
        return siList;
    }

}
