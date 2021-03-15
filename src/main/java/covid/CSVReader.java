package covid;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    private List<String> readLines(BufferedReader reader) throws IOException {
        List<String> result = new ArrayList<>();
        String line;
        while ((line = reader.readLine())  != null) {
            result.add(line);
        }
        return result;
    }

    public List<String> readCSV(String path) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(CSVReader.class.getResourceAsStream(path)))) {
            return new CSVReader().readLines(reader);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

}
