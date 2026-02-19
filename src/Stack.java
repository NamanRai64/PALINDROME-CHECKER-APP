public class Stack {
    private int top;
    private char[] charArray;
    private int capacity;

    public Stack(int size) {
        this.capacity = size;
        this.charArray = new char[capacity];
        this.top = -1;
    }

    public char peek() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        return charArray[top];
    }

    public char pop() {
        if (isEmpty()) {
            throw new java.util.EmptyStackException();
        }
        char poppedElement = charArray[top];
        top--;
        return poppedElement;
    }
    public void push(char element) {
        if (isFull()) {
            System.out.println("Stack Overflow - Cannot push element " + element);
            return;
        }
        top++;
        charArray[top] = element;
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull() {
        return top == capacity - 1;
    }
}
