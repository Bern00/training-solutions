package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MathAlgorithmsTest {

    @Test
    public void testIsPrime() {
        MathAlgorithms mathAlgorithms = new MathAlgorithms();
        assertEquals(true, MathAlgorithms.isPrime(7));
    }
}