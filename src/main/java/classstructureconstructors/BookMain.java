package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Book("Kiss Peter","Valami" );

        book.register("30");

        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(book.getRegNumber());


        }


}
