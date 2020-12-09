package controladvanced.duplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {

    List<Integer> numbers = Arrays.asList(1, 2, 3, 1, 1, 5, 1, 3, 2, 1, 12, 56, 6, 6, 1);


    public List<Integer> findDuplicates() {

        List<Integer> duplicationNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            for(int j = 0; j < i; j++){
                if(numbers.get(i) == numbers.get(j) && !duplicationNumbers.contains(numbers.get(j))){
                        duplicationNumbers.add(numbers.get(j));
                        break;
                }
            }
        }
        return duplicationNumbers;
    }

}
