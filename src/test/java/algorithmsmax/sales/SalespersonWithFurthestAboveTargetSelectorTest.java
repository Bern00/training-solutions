package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SalespersonWithFurthestAboveTargetSelectorTest {

    @Test
    public void testAboveTargetSelector() {
        SalespersonWithFurthestAboveTargetSelector aboveTargetSelector = new SalespersonWithFurthestAboveTargetSelector();

        List<Salesperson> salespersonList = Arrays.asList(
                new Salesperson("John Doe", 1200, 500),
                new Salesperson("Jack Doe", 800, 500),
                new Salesperson("John Smith", 400, 500)
        );

        assertEquals("John Doe", aboveTargetSelector.aboveTargetSelector(salespersonList).getName());
        assertEquals(1200, aboveTargetSelector.aboveTargetSelector(salespersonList).getAmount());
        assertEquals(700, aboveTargetSelector.aboveTargetSelector(salespersonList).getDifferenceFromTarget());
    }
}