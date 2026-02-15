/**
 * Test class to test the generic stack implementation with a number and a text stack.
 * @author Martin Stättner
 * @version 2026-02-15
 */
public class TestStack {
    public static void main(String[] args) {

        System.out.println("---NUMBER STACK TEST---");
        System.out.println();

        GenericStack<Integer> numberStack = new GenericStack<>(5);
        try{
            numberStack.push(1);
            numberStack.push(2);
            numberStack.push(3);
            numberStack.push(4);
            System.out.println("Generic number stack: " + numberStack.list());
            System.out.println();

            numberStack.pop();
            numberStack.pop();
            System.out.println("Popped generic number stack (2 times): " + numberStack.list());
            System.out.println();

            numberStack.peek();
            System.out.println("Peeking into the generic number stack (should end with 2): " + numberStack.list());
            System.out.println();

            numberStack.push(13);
            numberStack.push(14);
            numberStack.push(15);
            numberStack.push(16);
        }catch (StackFullException e){
            System.out.println("Stack is full (pushing 4 more elements is too much):\n" + e.getMessage() + "\nCurrent Stack (should end with 15): " + numberStack.list());
        }catch(StackEmptyException e){
            System.out.println("Stack is empty:\n" + e.getMessage());
        }

        System.out.println();
        System.out.println();

        System.out.println("---TEXT STACK TEST---");
        System.out.println();
        GenericStack<String> textStack = new GenericStack<>(5);
        try{
            textStack.push("BMW");
            textStack.push("Toyota");
            textStack.push("Honda");
            System.out.println("Generic text stack: " + textStack.list());
            System.out.println();

            textStack.pop();
            textStack.pop();
            textStack.pop();
            System.out.println("Popped generic text stack completely (should be empty): " + textStack.list());
            System.out.println();

            textStack.pop();
        }catch(StackEmptyException e){
            System.out.println("Stack is empty (too many pops):\n" + e.getMessage() + "\nCurrent Stack (should be empty): " + textStack.list());
        }catch(StackFullException e){
            System.out.println("Stack is full:\n" + e.getMessage());
        }
    }
}

