package neetcode.practice;

public class Q27PowerOfTwo {

    public static void main(String[] args) {
        int n1=1; //true 2^0 =1
        int n2=16; //true 2^4
        int n3 =3; //output=false

        System.out.println(isPowerOfTwo(n1));
        System.out.println(isPowerOfTwo(n2));
        System.out.println(isPowerOfTwo(n3));
    }

    public static boolean isPowerOfTwo(int n){
        while (n%2==0){
            n=n/2;
        }
        return n==1;
    }
}
