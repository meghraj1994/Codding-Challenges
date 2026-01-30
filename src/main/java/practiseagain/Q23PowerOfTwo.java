package practiseagain;

public class Q23PowerOfTwo {

    public static void main(String[] args) {
        int n1 = 1; // true 2^0
        int n2 = 16; //true 2^4
        int n3 = 3; //false

        System.out.println(isPowerOfTwo(n1));
        System.out.println(isPowerOfTwo(n2));
        System.out.println(isPowerOfTwo(n3));
    }

    public static boolean isPowerOfTwo(int num) {

        while (num % 2 == 0) {
            num = num / 2;
        }

        return num == 1;
    }
}
