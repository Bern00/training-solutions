package collectionsmap;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class LogParser {

    private static final int NUMBER_OF_FIELDS = 3;
    private static final int IPADDRESS_LOCATION = 0;
    private static final int DATE_LOCATION = 1;
    private static final int LOGIN_LOCATION = 2;
    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final String SEPARATOR = ":";


    public Map<String, List<Entry>> parseLog(String log) {

        try (Scanner scanner = new Scanner(log)) {

            Map<String, List<Entry>> elements = new HashMap<>();

            while (scanner.hasNext()) {
                String line = scanner.next();
                String[] lineElements = line.split(SEPARATOR);
                if(lineElements.length != NUMBER_OF_FIELDS) {
                    throw new IllegalArgumentException("Incorrect log: incorrect number of fields");
                }
                LocalDate entryDate = parseDate(lineElements[DATE_LOCATION]);
                fillMap(elements, new Entry(lineElements[IPADDRESS_LOCATION], lineElements[LOGIN_LOCATION], entryDate));
            }

            return elements;
        }

    }


    private void fillMap(Map<String, List<Entry>> elements, Entry entry) {
        if(!elements.containsKey(entry.getIpAddress())) {
            elements.put(entry.getIpAddress(), new ArrayList<>());
        }
        elements.get(entry.getIpAddress()).add(entry);
    }

    private LocalDate parseDate(String date) {
        try {
            return LocalDate.parse(date, DATE_FORMAT);
        }
        catch (DateTimeParseException ex) {
            throw new IllegalArgumentException("Incorrect log: incorrect date");
        }
    }
}
