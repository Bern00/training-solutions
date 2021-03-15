package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class DigitSumTest {

    @Test
    public void testSumOfDigits() {
        DigitSum digitSum = new DigitSum();
        int sum = digitSum.sumOfDigits(258);
        assertEquals(15, sum);
    }
}