package stringscanner;

import java.util.Scanner;
import java.lang.String;

public class StringScanner {

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }

    public int readAndSumValues(String intString, String delimiter) {

        try ( Scanner scanner = new Scanner(intString)) {

            if(!isEmpty(delimiter)) {
                scanner.useDelimiter(delimiter);
            }
            return calculateWithScanner(scanner);
        }
    }

    private int calculateWithScanner(Scanner sr) {
        int number = 0;
        try {
            while (sr.hasNext()) {
                number += sr.nextInt();
            }

        } catch (Exception exception) {
            throw new IllegalArgumentException("Incorrect parameter string!", exception);
        }
        return number;
    }

    public int readAndSumValues(String intString) {
        return readAndSumValues(intString, null);
    }

    public String filterLinesWithWordOccurrences(String text, String word) {
        if(isEmpty(text) || isEmpty(word)) {
            throw  new IllegalArgumentException("Incorrect parameter string!");
        }

        try(Scanner scanner = new Scanner(text)) {
            StringBuilder sb = new StringBuilder();
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.contains(word)) {
                    sb.append(line);
                    sb.append("\n");
                }
            }
            return sb.toString().trim();
        }
    }

}
