public class NotAnIntegerException extends Exception {
    private static final String message = "You can only enter positive integers as argument";

    public NotAnIntegerException() {
        super(message);
    }
}