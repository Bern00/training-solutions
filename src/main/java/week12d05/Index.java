package week12d05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Index {



    public int readLines(BufferedReader reader) throws IOException {
        String line;
        int result = 0;
        while ((line = reader.readLine())  != null) {
            result += counter(line, "koronavírus");

        }
        return result;
    }

    private int counter(String str, String word){
        int sum = 0;
        String[] strings = str.split("-");
        for(String s: strings){
            if(s.contains(word)){
                sum++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Index.class.getResourceAsStream("/index.html")))) {
            System.out.println(new Index().readLines(reader));
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
