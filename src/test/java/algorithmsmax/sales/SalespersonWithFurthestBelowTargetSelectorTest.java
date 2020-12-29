package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SalespersonWithFurthestBelowTargetSelectorTest {

    @Test
    public void testBelowTargetSelector() {
        SalespersonWithFurthestBelowTargetSelector belowTargetSelector = new SalespersonWithFurthestBelowTargetSelector();

        List<Salesperson> salespersonList = Arrays.asList(
                new Salesperson("John Doe", 1200, 500),
                new Salesperson("Jack Doe", 800, 500),
                new Salesperson("John Smith", 400, 500)
        );

        assertEquals("John Smith", belowTargetSelector.belowTargetSelector(salespersonList).getName());
        assertEquals(400, belowTargetSelector.belowTargetSelector(salespersonList).getAmount());
        assertEquals(-100, belowTargetSelector.belowTargetSelector(salespersonList).getDifferenceFromTarget());
    }
}