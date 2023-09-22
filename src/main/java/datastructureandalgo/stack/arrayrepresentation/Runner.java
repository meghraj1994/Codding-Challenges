package datastructureandalgo.stack.arrayrepresentation;

import java.util.Stack;

public class Runner {


    public static void main(String[] args) {

        StackImplementationUsingArray stack = new StackImplementationUsingArray(4);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack.pop());
        stack.display();
        stack.peek();
        System.out.println();
        System.out.println(stack.isFull());
        System.out.println(stack.isEmpty());

    }


}
