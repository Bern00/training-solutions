package week06d01;

import java.util.List;

public class ListSelector {

    public String listSorting(List<String> list) {
        if(list == null) {
            throw new IllegalArgumentException("Null string.");
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < list.size(); i++) {
            if(i%2 == 1){
                sb.append(list.get(i) + " ");
            }
        }
        return sb.toString().trim();
    }
}
