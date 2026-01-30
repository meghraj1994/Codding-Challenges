package practiseagain;

public class Q21PlusOne {

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};  // output = {1,2,4}
        int[] digits2 = {9, 9, 9};  // output = {1,0,0,0}

        for(int num : plusOne(digits2)){
            System.out.print(num+" ");
        }
    }

    public static int[] plusOne(int[] digits) {

        if (digits.length == 1 && digits[0] != 9) {
            digits[0] = digits[0] + 1;
            return digits;
        }
        int n= digits.length;

        for(int i=digits.length-1; i>=0;i--){
            if(digits[i] !=9){
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }

        if(digits[0] == 0){
            int[] newArray =  new int[n+1];
            newArray[0] =1;
            return newArray;
        }
        return digits;
    }
}
