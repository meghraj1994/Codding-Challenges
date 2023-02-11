package course;

public class SumOfDigitUsingRecursion {

    public static void main(String[] args) {
        System.out.println(sumOfDigit(2693));
    }

    public static int sumOfDigit(int n){
        if(n<0 || n==0) return 0;
        return n%10 + sumOfDigit(n/10);
    }
}
