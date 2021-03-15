package week10d01;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<GPS> coordinate){
        double result = 0;
        double height = coordinate.get(0).getZ();
        for(GPS gps: coordinate){
            if(gps.getZ() > height){
                result += gps.getZ() - height;
            }
            height = gps.getZ();
        }
        return result;
    }
}
