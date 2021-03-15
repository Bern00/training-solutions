package week08d02;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class LotteryTest {

    @Test
    public void testGetNumbers() {
        Lottery lottery = new Lottery();
        List<Integer> numbers = lottery.getNumbers();
        assertEquals("[47, 90, 56, 49, 83]", numbers);
    }
}