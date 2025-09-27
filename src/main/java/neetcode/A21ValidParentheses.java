package neetcode;

import java.util.Stack;

public class A21ValidParentheses {
    public static void main(String[] args) {
        String s1="()";    //output = true
        String s2="()[]{}";  //output = true
        String s3="(]";      //output = false

        System.out.println(isValidParentheses(s1));
        System.out.println(isValidParentheses(s2));
        System.out.println(isValidParentheses(s3));

    }

    public static boolean isValidParentheses(String s){

        //step1 : checking any edge case
        if(s.length()%2 !=0){
            return false;
        }

        //step2 : use stack
        Stack<Character> stack = new Stack<>();

        for(Character ch : s.toCharArray()){
            if(ch == '(' || ch=='{' || ch=='['){
                stack.push(ch);
            } else if(ch==')' && !stack.empty() && stack.peek()=='('){
                stack.pop();
            } else  if(ch=='}' && !stack.empty() && stack.peek()=='{'){
                stack.pop();
            } else if(ch==']' && !stack.empty() && stack.peek()=='['){
                stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack.isEmpty();
    }
}
