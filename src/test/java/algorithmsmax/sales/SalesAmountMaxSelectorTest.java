package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SalesAmountMaxSelectorTest {

    @Test
    public void testMaxRevenueName() {
        SalesAmountMaxSelector salesAmountMaxSelector = new SalesAmountMaxSelector();

        List<Salesperson> salespersonList = Arrays.asList(
                new Salesperson("John Doe", 1200, 500),
                new Salesperson("Jack Doe", 800, 500),
                new Salesperson("John Smith", 400, 500)
                );

        assertEquals("[John Doe]", salesAmountMaxSelector.maxRevenueName(salespersonList).toString());
    }
}