package collectionsiterator;

public class MissingBookException extends RuntimeException {

    public MissingBookException() {
    }

    public MissingBookException(String message) {
        super(message);
    }
}
