package interfacestaticmethods;

import java.util.List;

public interface Valued {

    static double sum(List<Valued> valueds) {
        double number = 0.0;
        for(Valued valued: valueds) {
            number += valued.getValue();
        }
        return number;
    }

    double getValue();
}
