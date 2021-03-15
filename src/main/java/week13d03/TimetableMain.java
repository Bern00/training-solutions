package week13d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TimetableMain {

    public void readLines(BufferedReader reader) throws IOException {
        String line;

        while ((line = reader.readLine())  != null) {
            System.out.println(line);
        }

    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(TimetableMain.class.getResourceAsStream("/beosztas.txt")))) {
            new TimetableMain().readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
