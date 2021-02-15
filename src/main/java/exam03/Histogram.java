package exam03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Histogram {

    public String createHistogram(BufferedReader reader) throws IOException {
        StringBuilder  createdSb = new StringBuilder();
        String line;
        int number = 0;

        while ((line = reader.readLine())  != null) {

            number = Integer.parseInt(line);
            for(int i = 0; i < number; i++) {
                createdSb.append("*");
            }
            createdSb.append("\n");
        }

        return createdSb.toString();
    }



    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(Histogram.class.getResourceAsStream("/histogram.txt")))) {
            new Histogram().createHistogram(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
