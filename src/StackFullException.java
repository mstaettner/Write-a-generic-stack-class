/**
 * Exception which is being thrown when the stack is full.
 * @author Martin Stättner
 * @version 2026-02-15
 */
public class StackFullException extends RuntimeException {
    public StackFullException(String message) {
        super(message);
    }
}