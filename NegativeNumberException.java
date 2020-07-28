public class NegativeNumberException extends Exception {
    private static final String message = "You can't enter negative number as argument";

    public NegativeNumberException() {
        super(message);
    }
}