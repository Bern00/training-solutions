package week08d05;

import java.util.*;

public class MathAlgorithms {

    public int greatestCommonDivisor(int numberOne, int numberTwo){

        List<Integer> first = division(numberOne);
        List<Integer> second = division(numberTwo);

        List<Integer> commonDividers = getIntegers(first, second);

        Collections.reverse(commonDividers);
        return commonDividers.get(0);

    }


    private List<Integer> getIntegers(List<Integer> first, List<Integer> second) {
        List<Integer> commonDividers = new ArrayList<>();
        for(Integer i: first){
            for(Integer j: second){
                if(i == j){
                    commonDividers.add(i);
                }
            }
        }
        return commonDividers;
    }

    private List<Integer> division(int number){
        List<Integer> divisors = new ArrayList<>();
        for(int i = 1; i < number; i++){
            if(number%i == 0){
                divisors.add(i);
            }
        }
        return divisors;
    }


}
