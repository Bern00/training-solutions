package collectionscomp;

import java.text.Collator;
import java.util.*;

public class OrderedLibrary {

    private List<Book> libraryBooks = new LinkedList<>();

    public OrderedLibrary(List<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }

    public List<Book> getLibraryBooks() {
        return libraryBooks;
    }

    public List<Book> orderedByTitle() {
        Collections.sort(libraryBooks);
        return libraryBooks;
    }

    public List<Book> orderedByAuthor() {
        Collections.sort(libraryBooks, new AuthorComparator());
        return libraryBooks;
    }

    public List<String> orderedByTitleLocale(Locale locale) {

        List<String> orderedList = new ArrayList<>();
        for (Book book : libraryBooks) {
            orderedList.add(book.getTitle());
        }

        Collator hungarianCollator = Collator.getInstance(locale);
        hungarianCollator.setStrength(Collator.PRIMARY);
        Collections.sort(orderedList, hungarianCollator);

        return orderedList;
    }

}
