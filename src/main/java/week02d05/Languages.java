package week02d05;

import java.util.ArrayList;
import java.util.List;

public class Languages {

    List<String> programmingTemplates = new ArrayList<>();

    public List<String> longerThanFive () {
        List<String> result = new ArrayList<>();
        for(String i: programmingTemplates) {
            if(i.length() > 5) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Languages languages = new Languages();
        languages.programmingTemplates.add("Java");
        languages.programmingTemplates.add("Python");
        languages.programmingTemplates.add("JavaScript");

        System.out.println(languages.longerThanFive().toString());

    }
}
