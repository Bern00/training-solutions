package week07d03;

import java.util.List;

public class NumberList {
    public boolean isIncreasing(List<Integer> numberList) {
        int number1 = numberList.get(0);
        int number2;
        for(Integer i: numberList){
            number2 = i;
            if(number2 - number1 < 0){
                return false;
            }
            number1 = number2;
        }
        return true;
    }

}
