package week04d02;

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String str, char character) {
        List<Integer> indexes = new ArrayList<>();
        int number = -1;
        for(char c: str.toCharArray()) {
            number++;
            if(c == character) {
                indexes.add(number);
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        Search search = new Search();
        System.out.println(search.getIndexesOfChar("almafa", 'a').toString());
    }
}
