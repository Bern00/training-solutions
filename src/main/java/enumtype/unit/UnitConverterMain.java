package enumtype.unit;

import java.math.BigDecimal;

public class UnitConverterMain {
    public static void main(String[] args) {
        UnitConverter unitConverter = new UnitConverter();
        System.out.println(unitConverter.convert(BigDecimal.valueOf(6352.47), LengthUnit.YARD, LengthUnit.MILLIMETER));
        System.out.println(unitConverter.siUnits());
    }
}
