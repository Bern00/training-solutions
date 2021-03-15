package week11d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordFilterTest {

    @Test
    public void testWordsWithChar() {
        WordFilter wordFilter = new WordFilter();
        List<String> words = Arrays.asList("aron", "tepsi", "balta", "kuka");

        assertEquals("[aron, balta, kuka]", wordFilter.wordsWithChar(words, 'a').toString());
    }
}