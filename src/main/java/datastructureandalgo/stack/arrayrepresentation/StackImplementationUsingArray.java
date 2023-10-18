package datastructureandalgo.stack.arrayrepresentation;

public class StackImplementationUsingArray {

    private int[] array;
    private int top;

    public StackImplementationUsingArray() {
        this.array = new int[30];
        this.top = -1;
    }

    public StackImplementationUsingArray(int maxSizeOfArray) {
        this.array = new int[maxSizeOfArray];
        this.top = -1;
    }

    public int size() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == array.length - 1;
    }

    public void push(int item) {
        if (top == array.length - 1) {
            System.out.println("stack is full or overflow");
            return;
        }
        top = top + 1;
        array[top] = item;

    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty or underflow");
            return 0;
        }

        int k = array[top];
        top = top - 1;
        return k;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("stack is empty or underflow");
            return 0;
        }
        return array[top];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return;
        }
        System.out.println("stack array elements are :");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }


}
