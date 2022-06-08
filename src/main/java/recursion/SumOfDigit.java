package recursion;



//find the sum of each digit using recursion
public class SumOfDigit {



    public static int sumOfDigits(int n){

        if(n==0)  return 0;
        return n%10 + sumOfDigits(n/10);


    }

    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversedNumber = 0;

        while (num != 0) {
            reversedNumber =reversedNumber*10 + num % 10;
            num = num/10;
        }
        if(reversedNumber == originalNum) return  true;
        return false;
    }


    public static void main(String[] args) {

        System.out.println(sumOfDigits(123));
        System.out.println(isPalindrome(123));
        System.out.println(isPalindrome(121));
    }
}
