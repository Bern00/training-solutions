package stringbuilder;

public class Palindrome {

    public boolean isPalindrome(String word) {
        if(word == null) {
            throw new IllegalArgumentException("Not valid information");
        }

        StringBuilder sbWord = new StringBuilder();
        return sbWord.append(word).toString().equalsIgnoreCase(sbWord.reverse().toString());
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome("piAIP"));
    }
}
