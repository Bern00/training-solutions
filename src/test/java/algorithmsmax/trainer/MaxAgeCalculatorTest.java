package algorithmsmax.trainer;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MaxAgeCalculatorTest {

    @Test
    public void testTrainerWithMaxAge() {
        MaxAgeCalculator maxAgeCalculator = new MaxAgeCalculator();

        List<Trainer> trainerList = Arrays.asList(
                new Trainer("John Doe", 35),
                new Trainer("Jack Doe", 32),
                new Trainer("John Smith", 48),
                new Trainer("Jack Smith", 50)
        );

        assertEquals("Jack Smith", maxAgeCalculator.trainerWithMaxAge(trainerList).getName());

    }
}