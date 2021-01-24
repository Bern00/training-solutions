package filescanner.library;

import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void testLoadFromFile() {
        Library library = new Library();

        library.loadFromFile();

        assertEquals(3, library.getBooks().size());
        assertEquals("Faragó József", library.getBooks().get(2).getAuthor());
    }
}