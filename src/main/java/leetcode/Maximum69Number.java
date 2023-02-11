package leetcode;

public class Maximum69Number {

    public static void main(String[] args) {

      /*  Example 1:
        Input: num = 9669
        Output: 9969
        Explanation:
        Changing the first digit results in 6669.
        Changing the second digit results in 9969.
        Changing the third digit results in 9699.
        Changing the fourth digit results in 9666.
        The maximum number is 9969. */
        System.out.println(maximum69Number(9969));


        /* Example 2:
        Input: num = 9996
        Output: 9999
        Explanation: Changing the last digit 6 to 9 results in the maximum number. */
        System.out.println(maximum69Number(9996));

        /* Example 3:
        Input: num = 9999
        Output: 9999
        Explanation: It is better not to apply any change. */
        System.out.println(maximum69Number(9999));


    }

    public static int maximum69Number (int num) {

        int m =0;

        while(num>=10){
            num = num/10;
            if(num !=9){

            }
        }

        return m;
    }
}
