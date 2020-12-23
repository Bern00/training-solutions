package stringmethods.filename;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FileNameManipulatorTest {

    @Test
    public void testFindLastCharacter_EmptyParameter() {
        try {
            FileNameManipulator fileNameManipulator = new FileNameManipulator();
            fileNameManipulator.findLastCharacter("");
        } catch (Exception exception) {
            assertEquals(exception.getMessage(), ("Not valid information."));
        }
    }

    @Test
    public void testFindLastCharacter_NullParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().findLastCharacter(null);
        });
        assertEquals("Not valid information.", exception.getMessage());
    }

    @Test
    public void testFindLastCharacter_WhiteSpaceOnlyParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().findLastCharacter(" ");
        });
        assertEquals("Not valid information.", exception.getMessage());
    }

    @Test
    public void testFindLastCharacter() {
        //Given
        FileNameManipulator fileNameManipulator = new FileNameManipulator();

        //When
        char i = fileNameManipulator.findLastCharacter("valamire");

        //Then
        assertEquals(i, 'e');
    }

    @Test
    public void testFindFileExtension_EmptyParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().findFileExtension("");
        });
        assertEquals("Invalid file name!", exception.getMessage());
    }

    @Test
    public void testFindFileExtension_NullParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().findFileExtension(null);
        });
        assertEquals("Invalid file name!", exception.getMessage());
    }

    @Test
    public void testFindFileExtension_WhiteSpaceOnlyParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().findFileExtension(" ");
        });
        assertEquals("Invalid file name!", exception.getMessage());
    }

    @Test
    public void testFindFileExtension() {
        assertEquals(".txt", new FileNameManipulator().findFileExtension("valami.txt"));
    }

    @Test
    public void testIdentifyFilesByExtension_EmptyParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().identifyFilesByExtension("", "valami.txt");
        });
        assertEquals("Invalid argument!", exception.getMessage());
    }

    @Test
    public void testIdentifyFilesByExtension_NullParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().identifyFilesByExtension(null, "valami.txt");
        });
        assertEquals("Invalid argument!", exception.getMessage());
    }

    @Test
    public void testIdentifyFilesByExtension_WhiteSpaceOnlyParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().identifyFilesByExtension(" ", "valami.txt");
        });
        assertEquals("Invalid argument!", exception.getMessage());
    }

    @Test
    public void testIdentifyFilesByExtension() {
        assertTrue(new FileNameManipulator().identifyFilesByExtension("txt", "valami.txt"));
        assertFalse(new FileNameManipulator().identifyFilesByExtension("data", "valami.txt"));
    }

    @Test
    public void testCompareFilesByName_EmptyParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().compareFilesByName("", "valami.txt");
        });
        assertEquals("Invalid argument!", exception.getMessage());
    }

    @Test
    public void testCompareFilesByName_NullParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().compareFilesByName(null, "valami.txt");
        });
        assertEquals("Invalid argument!", exception.getMessage());
    }

    @Test
    public void testCompareFilesByName_WhiteSpaceOnlyParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().compareFilesByName(" ", "valami.txt");
        });
        assertEquals("Invalid argument!", exception.getMessage());
    }

    @Test
    public void testCompareFilesByName() {
        assertTrue(new FileNameManipulator().compareFilesByName("valami.txt", "valami.txt"));
        assertFalse(new FileNameManipulator().compareFilesByName("aki.txt", "valami.txt"));
    }

    @Test
    public void testChangeExtensionToLowerCase_EmptyParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().changeExtensionToLowerCase("");
        });
        assertEquals("Invalid file name!", exception.getMessage());
    }

    @Test
    public void testChangeExtensionToLowerCase_NullParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().changeExtensionToLowerCase(null);
        });
        assertEquals("Invalid file name!", exception.getMessage());
    }

    @Test
    public void testChangeExtensionToLowerCase_WhiteSpaceOnlyParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().changeExtensionToLowerCase(" ");
        });
        assertEquals("Invalid file name!", exception.getMessage());
    }


    @Test
    public void testChangeExtensionToLowerCase() {
        assertEquals("VALAMI.txt", new FileNameManipulator().changeExtensionToLowerCase("VALAMI.TXT"));
    }

    @Test
    public void testReplaceStringPart_EmptyParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().replaceStringPart("", "ami", "aki");
        });
        assertEquals("Invalid file name!", exception.getMessage());
    }

    @Test
    public void testReplaceStringPart_NullParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().replaceStringPart(null, "ami", "aki");
        });
        assertEquals("Invalid file name!", exception.getMessage());
    }

    @Test
    public void testReplaceStringPart_WhiteSpaceOnlyParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new FileNameManipulator().replaceStringPart(" ", "ami", "aki");
        });
        assertEquals("Invalid file name!", exception.getMessage());
    }

    @Test
    public void testReplaceStringPart() {
        assertEquals("valaki.txt", new FileNameManipulator().replaceStringPart("valami.txt", "ami", "aki"));
    }

}