package sorting;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class OrderedLibrary {

    private Set<Book> library;

    public OrderedLibrary(Set<Book> library) {
        this.library = library;
    }


    public Book lendFirstBook() {
        if(library.size() == 0) {
            throw new NullPointerException("Libray is empty!");
        }

        Iterator<Book> bookIterator = library.iterator();
        return bookIterator.next();

    }
}
