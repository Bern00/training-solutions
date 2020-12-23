package stringbuilder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PalindromeTest {

    @Test
    public void testIsPalindrome() {
        assertTrue(new Palindrome().isPalindrome("piaIP"));
        assertFalse(new Palindrome().isPalindrome("piaz"));
    }

    @Test
    public void testIsPalindrome_NullParameter() throws IllegalArgumentException {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Palindrome().isPalindrome(null);
        });
        assertEquals("Not valid information", exception.getMessage());
    }
}