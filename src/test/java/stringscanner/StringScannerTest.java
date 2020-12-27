package stringscanner;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringScannerTest {

    @Test
    public void testReadAndSumValues() {
        assertEquals(6, new StringScanner().readAndSumValues("1 2 3", " "));
        assertEquals(6, new StringScanner().readAndSumValues("1 2 3", null));
    }

    @Test
    public void testTestReadAndSumValues() {
        assertEquals(6, new StringScanner().readAndSumValues("1 2 3"));
    }

    @Test
    public void testFilterLinesWithWordOccurrences() {
        assertEquals("Valaki elment.", new StringScanner().filterLinesWithWordOccurrences("Valaki elment.\n" +
                "Valahova ment.\n" +
                "Nem tudjuk hova lett.", "elment"));
    }

}