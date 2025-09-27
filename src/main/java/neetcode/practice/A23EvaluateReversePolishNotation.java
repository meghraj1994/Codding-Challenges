package neetcode.practice;

import java.util.Stack;

public class A23EvaluateReversePolishNotation {

    public static void main(String[] args) {

        String[] tokens= {"2","1","+"};
        String[] tokens2= {"2","1","+","3","+"};
        System.out.println(findPolishedReverseNotation(tokens));
        System.out.println(findPolishedReverseNotation(tokens2));
    }

    public static int findPolishedReverseNotation(String[] tokes){
        Stack<Integer> stack = new Stack<>();


        for(String token : tokes){
            if(isOperator(token)){
              int b = stack.pop();
              int a = stack.pop();
              int result = applyOperator(token,a,b);
              stack.push(result);
            } else {
                 stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }

    private static int applyOperator(String token, int a, int b) {
        switch (token){
            case "+" : return a+b;
            case "-": return a-b;
            case "*":return a*b;
            case "/": return a/b;
            default: throw new IllegalArgumentException("invalid argument"+token);
        }
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }
}
