package searching.bookarraysearch;

import java.util.Arrays;

public class BookArraySearch {

    private Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book findBookByAuthorTitle(String author, String title) {

        if(isEmpty(author) || isEmpty(title)) {
            throw new IllegalArgumentException("Author or title must not be empty!");
        }

        Book key = new Book(author, title);
        Arrays.sort(bookArray);
        if(Arrays.binarySearch(bookArray, key) < 0) {
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
        return bookArray[Arrays.binarySearch(bookArray, key)];
    }

    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }
}
