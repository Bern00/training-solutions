package week05d03;

import java.util.Arrays;
import java.util.List;

public class ListCounter {

    public int counter(List<String> strings) {
        int result = 0;
        for(String s: strings) {
            if(s.substring(0, 1).toLowerCase().equals("a")) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListCounter listCounter = new ListCounter();
        List<String> strings = Arrays.asList("Aron", "anna", "Béla");
        System.out.println(listCounter.counter(strings));
    }
}
