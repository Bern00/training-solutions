package week10d05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculator {

    public int findMinSum(int[] arr){
        if(arr.length < 4){
            throw new IllegalArgumentException("Not enough numbers.");
        }
        List<Integer> numbers = new ArrayList<>();
        for(int n: arr){
            numbers.add(n);
        }
        Collections.sort(numbers);
        int result = numbers.get(0) + numbers.get(1) + numbers.get(2) + numbers.get(3);
        return result;
    }

}
