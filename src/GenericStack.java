/**
 * A generic stack implementation based on an array.
 *
 * @author Martin Stättner
 * @version 2026-02-15
 * @param <T> the type of the element which is being stored in the stack
 */
public class GenericStack <T> {
    private Object[] stack;
    private int top;

    /**
     * Creates a stack with a specific size.
     * @param size The size of the stack.
     * @throws IllegalArgumentException if size is less than 1.
     */
    public GenericStack(int size){
        if(size < 1) throw new IllegalArgumentException("Size must be positive");
        this.stack = new Object[size];
        this.top = -1;
    }

    /**
     * Creates a stack with default size (10).
     */
    public GenericStack(){
        this(10);
    }

    /**
     * Pushes a new top element onto the stack.
     * @param element the element which should be pushed to the top of the stack.
     * @throws StackFullException if the stack is already full of elements.
     */
    public void push(T element) throws StackFullException {
        if(this.top == stack.length-1) throw new StackFullException("Stack is already full");
        this.top++;
        stack[this.top] = element;
    }

    /**
     * Removes and returns the top. element of the stack
     * @return the removed element. (which was at the top)
     * @throws StackEmptyException if the stack is empty. (has no more elements in it)
     */
    @SuppressWarnings("unchecked")
    public T pop() throws StackEmptyException {
        if(this.top == -1) throw new StackEmptyException("Stack is empty");
        Object remove = stack[this.top];
        stack[this.top] = null;
        this.top--;
        return (T) remove;
    }

    /**
     * Returns the top element of the stack. (doesn't remove it)
     * @return the top element of the stack.
     * @throws StackEmptyException if the stack is empty. (has elements in it)
     */
    @SuppressWarnings("unchecked")
    public T peek() throws StackEmptyException {
        if(top == -1) throw new StackEmptyException("Stack is empty - peeking not possible");
        return (T) stack[top];
    }

    /**
     * Returns all elements of the stack in form of a String.
     * @return the string representation of the stack.
     */
    public String list(){
        String list = "";
        for(int i = 0; i <= top; i++){
            list += this.stack[i];
            if(i < this.top) list += "; ";
        }
        return list;
    }
}