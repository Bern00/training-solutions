package week10d01;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HikingTest {

    @Test
    public void testGetPlusElevation() {
        Hiking hiking = new Hiking();
        List<GPS> coordinate = Arrays.asList(   new GPS(10,20,5),
                                                new GPS(10,20,30),
                                                new GPS(10,20,20),
                                                new GPS(10,20,25),
                                                new GPS(10,20,30)
        );

        double number = hiking.getPlusElevation(coordinate);

        assertEquals(35, number, 1);

    }
}