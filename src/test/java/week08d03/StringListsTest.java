package week08d03;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class StringListsTest {

    @Test
    public void testStringListsUnion() {
        StringLists stringLists = new StringLists();
        List<String> first = Arrays.asList("Alma", "Szilva", "Körte");
        List<String> second = Arrays.asList("Alma", "Enikő", "Fanni");
        Set<String> unio = stringLists.stringListsUnion(first, second);
        assertEquals("[Alma, Fanni, Enikő, Körte, Szilva]", unio.toString());
    }
}