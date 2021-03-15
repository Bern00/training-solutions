package week10d05;

import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void testFindMinSum() {
        Calculator calculator = new Calculator();

        assertEquals(20, calculator.findMinSum(new int[]{12,2,2,7,9}));

    }
}