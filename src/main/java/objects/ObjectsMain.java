package objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ObjectsMain {
    public static void main(String[] args) {
        new Book();
        System.out.println(new Book());
        Book emptyBook = null;
        System.out.println(emptyBook);
        Book book = new Book();
        System.out.println(book);
        book = null;
        System.out.println(book);
        book = new Book();
        System.out.println(book);

        Book anotherBook = new Book();
        System.out.println(anotherBook == book);

        anotherBook = book;
        System.out.println(anotherBook == book);
        System.out.println(anotherBook instanceof Book);


        Book[] books = {new Book(), new Book(), new Book()};

        List<Book> bookList = Arrays.asList(new Book(), new Book(), new Book());

        List<Book> anotherBookList = new ArrayList<>();
        anotherBookList.add(new Book());
        anotherBookList.add(new Book());
        anotherBookList.add(new Book());

    }
}
