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
    public void invalidParametersShouldThrowExceptionIfNullString() throws IllegalArgumentException {
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
    public void testFindFileExtension() {
        assertEquals(".txt", new FileNameManipulator().findFileExtension("valami.txt"));
    }

    @Test
    public void testIdentifyFilesByExtension() {
    }

    @Test
    public void testCompareFilesByName() {
    }

    @Test
    public void testChangeExtensionToLowerCase() {
    }

    @Test
    public void testReplaceStringPart() {
    }

}