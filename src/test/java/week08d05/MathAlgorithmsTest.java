package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MathAlgorithmsTest {

    @Test
    public void testGreatestCommonDivisor() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertEquals(60, mathAlgorithms.greatestCommonDivisor(180, 120));
    }
}