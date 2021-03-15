package week08d03;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringLists {

    public Set<String> stringListsUnion(List<String> first, List<String> second){
        Set<String> strings = new HashSet<>();
        for(String str: first){
            strings.add(str);
        }

        for(String str: second){
            strings.add(str);
        }
        return strings;
    }
}
