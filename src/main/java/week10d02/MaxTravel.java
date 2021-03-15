package week10d02;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxTravel {

    public int getMaxIndex(List<Integer> numbers) {
        checkParameter(numbers);
        Map<Integer, Integer> numbersMap = getNumbersMap(numbers);
        int maxKey = getMaxKey(numbersMap);
        return maxKey;
    }

    private void checkParameter(List<Integer> numbers) {
        int max = 0;
        for (Integer n: numbers) {
            if (n > max) {
                max = n;
            }
        }
        if(max > 29){
            throw new IllegalArgumentException("Invalid parameter");
        }
    }

    private int getMaxKey(Map<Integer, Integer> numbersMap) {
        int maxKey = 0;
        int maxValue = 0;
        for(Integer i: numbersMap.keySet()){
            if (numbersMap.get(i) > maxValue) {
                maxKey = i;
                maxValue = numbersMap.get(i);
            }
        }
        return maxKey;
    }


    private Map<Integer, Integer> getNumbersMap(List<Integer> numbers) {
        Map<Integer, Integer> numbersMap = new HashMap<>();
        for(Integer i: numbers){
            if(numbersMap.containsKey(i)){
                numbersMap.put(i, numbersMap.get(i) +1);
            } else {
                numbersMap.put(i, 1);
            }
        }
        return numbersMap;
    }
}
