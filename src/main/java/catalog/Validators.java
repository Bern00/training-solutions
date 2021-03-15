package catalog;

import java.util.List;

public class Validators {

    public static boolean isBlank(String str){
        return str == null || "".equals(str.trim());
    }

    public static boolean isEmpty(List<String> stringList){
        return stringList.size() == 0;
    }
}
