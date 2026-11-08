package ArrayStackAssignment;

public class ArrayStack<T> {

    private T[] elements;
    private int top;

    // Constructor
    public ArrayStack(int capacity) {

        elements = (T[]) new Object[capacity];

        top = -1;
    }

    // push().
    public void push(T element) {

        if (top == elements.length - 1) {

            expandCapacity();
        }

        top++;

        elements[top] = element;
    }

    // pop().
    public T pop() {

        if (isEmpty()) {

            System.out.println("Stack Underflow!");

            return null;
        }

        T removedElement = elements[top];

        elements[top] = null;

        top--;

        return removedElement;
    }

    // peek().
    public T peek() {

        if (isEmpty()) {

            System.out.println("Stack is Empty!");

            return null;
        }

        return elements[top];
    }

    // isEmpty().
    public boolean isEmpty() {

        return top == -1;
    }

    // Size().
    public int size() {

        return top + 1;
    }

    // Expand array capacity
    public void expandCapacity() {

        T[] newArray =
                (T[]) new Object[elements.length * 2];

        for (int i = 0; i < elements.length; i++) {

            newArray[i] = elements[i];
        }

        elements = newArray;
    }

    // Display elements from top to bottom
    public void displayElements() {

        if (isEmpty()) {

            System.out.println("Stack is Empty!");

            return;
        }

        for (int i = top; i >= 0; i--) {

            System.out.println(elements[i]);
        }
    }
}
