package week08d02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {
    public List<Integer> getNumbers(){

        List<Integer> numbers = createdList();

        List<Integer> winningNumbers = winning(numbers);
        return winningNumbers;
    }

    private List<Integer> winning(List<Integer> numbers) {
        List<Integer> winningNumbers = new ArrayList<>();
        for(int i = 0; i < 5; i++){
            winningNumbers.add(numbers.get(i));
        }
        return winningNumbers;
    }


    private List<Integer> createdList() {
        List<Integer> numbers = new ArrayList<>();
        for(int i = 1; i < 91; i++){
            numbers.add(i);
        }
        Collections.shuffle(numbers);
        return numbers;
    }
}
