package recursion;

public class GCD  {


    //using Euclidean algorithm
    public static int calculateGCD(int n1, int n2) {

        if(n2 == 0){
            return n1;
        } else {
            return calculateGCD(n2, n1%n2);
        }

    }

    public static void main(String[] args) {
        System.out.println(calculateGCD(8, 12));
        System.out.println(calculateGCD(48, 18));
    }
}
