package algorithmsmax.maxszam;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class IntegerMaxCalculatorTest {

    @Test
    public void testMaxNumber() {
        IntegerMaxCalculator integerMaxCalculator = new IntegerMaxCalculator();
        List<Integer> integerList = Arrays.asList(1, 2, 3, 8, 5, 9, 7);

        assertEquals(new Integer(9), integerMaxCalculator.maxNumber(integerList));
    }
}