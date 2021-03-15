package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NumberListTest {

    @Test
    public void testIsIncreasing() {
        NumberList numberList = new NumberList();
        List<Integer> numbers = Arrays.asList(2,3,4,5,5,6,3);
        assertEquals(false, numberList.isIncreasing(numbers));
    }
}