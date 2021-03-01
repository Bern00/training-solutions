package week15d04;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Week15d04 {

    public List<CovidCasesByWeek> readLines(BufferedReader reader) throws IOException {

        List<String> covidInHungary = getStrings(reader);
        List<CovidCasesByWeek> casesWeekly = getCovidCasesByWeeks(covidInHungary);
        return extracted(casesWeekly);
    }


    private List<String> getStrings(BufferedReader reader) throws IOException {
        List<String> covidInHungary = new ArrayList<>();
        String line;
        while ((line = reader.readLine())  != null) {
            if(line.contains("Hungary")) {
                covidInHungary.add(line);
            }
        }
        return covidInHungary;
    }

    private List<CovidCasesByWeek> extracted(List<CovidCasesByWeek> casesWeekly) {
        List<CovidCasesByWeek> firstThree = new ArrayList<>();
        Collections.sort(casesWeekly);
        for(int i = 0; i < 3; i++) {
            firstThree.add((casesWeekly.get(i)));
        }
        return firstThree;
    }


    private List<CovidCasesByWeek> getCovidCasesByWeeks(List<String> covidInHungary) {
        List<CovidCasesByWeek> casesWeekly = new ArrayList<>();
        for(String s: covidInHungary) {
            String[] lineArray = s.split(",");
            casesWeekly.add(new CovidCasesByWeek(lineArray[1], Integer.parseInt(lineArray[2])));
         }
        return casesWeekly;
    }

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("data.csv"))) {
            Week15d04 week15d04 = new Week15d04();
            System.out.println(week15d04.readLines(reader));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }

    }
}
