package week12d03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberStat {
    public int numbers(List<Integer> integers){
        if(integers.size() < 1){
            throw new IllegalArgumentException("Invalid list");
        }
        return getMinKey(getNumbersMap(integers));
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

    private int getMinKey(Map<Integer, Integer> numbersMap) {
        int minKey = 0;
        int minValue = Integer.MAX_VALUE;
        for(Integer i: numbersMap.keySet()){
            if (numbersMap.get(i) < minValue) {
                minKey = i;
                minValue = numbersMap.get(i);
            }
        }
        return minKey;
    }
}
