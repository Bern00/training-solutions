package algorithmsmax.maxszam;

import java.util.List;

import static java.lang.Integer.MIN_VALUE;

public class IntegerMaxCalculator {

    public Integer maxNumber(List<Integer> numbers) {
        Integer number = MIN_VALUE;
        for(Integer integer: numbers) {
            if(integer > number) {
                number = integer;
            }
        }
        return number;
    }
}
