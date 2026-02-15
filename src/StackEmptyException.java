/**
 * Exception which is being thrown when the stack is empty.
 * @author Martin Stättner
 * @version 2026-02-15
 */
public class StackEmptyException extends RuntimeException {
    public StackEmptyException(String message) {
        super(message);
    }
}