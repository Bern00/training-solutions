package week10d02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MaxTravelTest {

    @Test
    public void testGetMaxIndex() {
        MaxTravel maxTravel = new MaxTravel();
        List<Integer> numbers = Arrays.asList(2,2,2,0,1,8,14,14,14,14,10);
        assertEquals(14, maxTravel.getMaxIndex(numbers));
    }
}