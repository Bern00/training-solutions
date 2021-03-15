package week13d01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class City {

    public String readLines(BufferedReader reader) throws IOException {
        List<String> cities = new ArrayList<>();

        String line;
        while ((line = reader.readLine())  != null) {
                String[] words = line.split(";");
                String word = words[1];
                cities.add(word);
        }

        String result = maxString(cities);

        return result;
    }


    private String maxString(List<String> cities) {
        String result = "";
        for(String s: cities){
            if(s.length() > result.length()){
                result = s;
            }
        }
        return result;
    }


    public static void main(String[] args) {

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(City.class.getResourceAsStream("/iranyitoszamok-varosok-2021.csv")))) {
                System.out.println(new City().readLines(reader));
            } catch (IOException ioe) {
                throw new IllegalStateException("Can not read file", ioe);
            }

        }

}
