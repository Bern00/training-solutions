package genericsusage;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LibraryWithOutGenericsTest {

    @Test
    public void shouldThrowExceptionIfArgumentIsNull() {
        assertThrows(NullPointerException.class, () -> new LibraryWithOutGenerics().getFirstBook(null));
    }

    @Test
    public void shouldThrowExceptionIfArgumentIsEmptyList() {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new LibraryWithOutGenerics().getFirstBook(new ArrayList()));
        assertEquals("Argument should not be empty!", ex.getMessage());
    }

    @Test
    public void shouldThrowExceptionAddingDifferentObjects() {
        LibraryWithOutGenerics library = new LibraryWithOutGenerics();
        Exception ex = assertThrows(ClassCastException.class, () -> library.getFirstBook(Arrays.asList("", "", "")));
        assertEquals("Not a book", ex.getMessage());
    }

    @Test
    public void shouldReturnFirst() {
        assertEquals("Egri Csillagok", new LibraryWithOutGenerics().getFirstBook(Arrays.asList(new Book("Egri Csillagok"), new Book("Antigoné"))).getTitle());
    }
}