package week15d02;

import java.io.*;
import java.util.*;

public class Week15d02 {

    private BufferedReader reader;
    private Map<String, List<String>> data;

    private void readResource() {
        try {
            reader = new BufferedReader(new InputStreamReader(Week15d02.class.getResourceAsStream("/kerdesek.txt")));
            String line = "";
            String lineTwo;

            while (line != null) {

                line = reader.readLine();
                lineTwo = reader.readLine();

                if(line != null) {
                    data.put(line, stringSplit(lineTwo));
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<String> getWuestionsByTheme(String str) {
        List<String> result = new ArrayList<>();
        data.forEach ((k, v) -> {
            if(v.get(2).equals(str)) {
                result.add(k);
            }
        }
        );
        return result;
    }

    public List<String> randomQuestion() {
        List<String> questions = new ArrayList<>();
        questions.addAll(data.keySet());
        Collections.shuffle(questions);
        return data.get(questions.get(0));
    }



    private List<String> stringSplit(String str) {
        List<String> result = new ArrayList<>();
        String[] line = str.split(" ");
        for(String s: line) {
            result.add(s);
        }
        return result;
    }
}


