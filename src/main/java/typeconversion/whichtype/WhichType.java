package typeconversion.whichtype;


import java.util.ArrayList;
import java.util.List;

public class WhichType {

    public List<Type> whichType(String s) {

        long sErteke = Long.parseLong(s);

        List<Type> typeList = new ArrayList<>();

        if (sErteke <= Byte.MAX_VALUE) {
            typeList.add(Type.BYTE);
        }

        if (sErteke <= Short.MAX_VALUE) {
            typeList.add(Type.SHORT);
        }

        if (sErteke <= Integer.MAX_VALUE) {
            typeList.add(Type.INT);
        }

        if (sErteke <= Long.MAX_VALUE) {
            typeList.add(Type.LONG);

        }
        return typeList;
    }
}
