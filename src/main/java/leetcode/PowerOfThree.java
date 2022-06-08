package leetcode;

public class PowerOfThree {
    public static void main(String[] args) {
        int n1 = 27;
//        Output: true
        int n2 = 0;
//        Output: false

        int n3 = 9;
//        Output: true
        System.out.println(isPowerOfThree(n1));
        System.out.println(isPowerOfThree(n2));
        System.out.println(isPowerOfThree(n3));
    }

//    public static boolean isPowerOfThree(int n) {
//        if(n == 0) return false;
//        int counter = 0;
//
//       boolean isTrue = false;
//        while (counter == 0) {
//                if (n == 1) {
//                    isTrue = true;
//                    break;
//                }
//                counter = n % 3;
//                n = n / 3;
//            }
//
//        return isTrue;
//    }

    public static boolean isPowerOfThree(int n) {
//        double output = Math.log10(n)/Math.log10(3);
        double output = Math.log(n)/Math.log(3);
        return Double.compare(output,(int)output)==0;
    }


}
