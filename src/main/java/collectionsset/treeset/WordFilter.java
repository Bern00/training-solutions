package collectionsset.treeset;

import java.util.Set;
import java.util.TreeSet;

public class WordFilter {
    public Set<String> filterWords(String[] randomStrings) {
        Set<String> linedUpString = new TreeSet<String>();
        for(String s: randomStrings) {
            linedUpString.add(s);
        }
        return linedUpString;
    }
}
