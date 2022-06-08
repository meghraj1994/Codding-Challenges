package leetcode;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);

        int root = stack.pop();
        System.out.println(root);
    }
}
