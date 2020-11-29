package primitivetypes;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypes {

    private List<Integer> kettesMaradekok = new ArrayList<>();
    private String c = "";

    public String toBinaryString(int n) {
        int szam = n;

        for (int i = 0; i < 32; i++) {
            int a = szam % 2;
            kettesMaradekok.add(a);
            szam = szam / 2;
        }

        for (int i = 31; i >= 0; i--) {
            c = c + "" +kettesMaradekok.get(i);
        }
        return c;
    }



}
