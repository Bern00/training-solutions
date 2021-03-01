package week15d01;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Week15d01 {

    private Map<Integer, Integer> coordinateSystem;

    public Week15d01(Map<Integer, Integer> coordinateSystem) {
        this.coordinateSystem = coordinateSystem;
    }

    public Map<Integer, Integer> maxPairs() {

        Map<Integer, Integer> maxPairs = new HashMap<>();
        for (Map.Entry entry: coordinateSystem.entrySet()) {
            if(entry.getValue().equals(maxValue())) {
                maxPairs.put((Integer) entry.getKey(), (Integer) entry.getValue());
            }
        }
        return maxPairs;
    }

    private Integer maxValue() {
        Week15d01 week15d01 = new Week15d01(coordinateSystem);
        Collection<Integer> values = coordinateSystem.values();
        int maxValue = week15d01.max(values);
        return maxValue;
    }

    private int max(Collection<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for (Integer n: numbers) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }


}
