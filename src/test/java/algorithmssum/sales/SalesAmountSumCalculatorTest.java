package algorithmssum.sales;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SalesAmountSumCalculatorTest {

    @Test
    public void testSumSales() {

        SalesAmountSumCalculator salesAmountSumCalculator = new SalesAmountSumCalculator();

        List<Salesperson> salespeople = Arrays.asList(
                new Salesperson("Kiss Balázs", 12),
                new Salesperson("Nagy Gróf", 8),
                new Salesperson("Kovács István", 20),
                new Salesperson("Tóth Béla", 10)
        );

        assertEquals(50, salesAmountSumCalculator.sumSales(salespeople));

    }
}