package phase1;

public class Za_Power_Of_Two {
    public static void main(String[] args) {

        int n1 = 1;       //output=true because 2^0=1
        int n2 = 16;       //output=true  because 2^4=16
        int n = 3;         //output=false

        System.out.println(isTwoPower(n1));
        System.out.println(isTwoPower(n2));
        System.out.println(isTwoPower(n));
    }

    public static boolean isTwoPower(int n) {

        while (n % 2 == 0) {
            n = n / 2;
        }
        return n == 1;
    }
}
