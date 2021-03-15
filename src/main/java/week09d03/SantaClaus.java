package week09d03;

import java.util.ArrayList;
import java.util.List;

public class SantaClaus {
    List<Person> persons = new ArrayList<>();

    public void getThroughChimneys(){
        for(Person p: persons){
            p.setPresent();
        }
    }
}
