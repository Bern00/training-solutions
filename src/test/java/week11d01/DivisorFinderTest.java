package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DivisorFinderTest {

    @Test
    public void testFindDivisors() {
        DivisorFinder divisorFinder = new DivisorFinder();
        assertEquals(2, divisorFinder.findDivisors(5425));
    }
}