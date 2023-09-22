package leetcode;

public class SwapThreeNumbers {

    public static void main(String[] args) {
        swapThreeNumbers(10,20,30);
    }

    public static void swapThreeNumbers(int a, int b , int c) {

        System.out.println("before swapping :");
        System.out.println("a= "+a+"\tb= "+b+"\tc= "+c);
        a = a+b+c;
        b=a-b-c;
        c=a-b-c;
        a=a-b-c;
        System.out.println("after swapping :");
        System.out.println("a= "+a+"\tb= "+b+"\tc= "+c);

    }
}
