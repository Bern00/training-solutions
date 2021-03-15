package week12d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumberStatTest {

    @Test
    public void testNumbers() {
        NumberStat numberStat = new NumberStat();
        List<Integer> numberList = Arrays.asList(1,1,5,3,4,5,6,5,6,4,1,6,5,4);
        assertEquals(3, numberStat.numbers(numberList));
    }
}