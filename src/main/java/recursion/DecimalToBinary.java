package recursion;

public class DecimalToBinary {

    public static int calculateBinary(int n) {

        if(n/2 == 0){
            return n%2;
        } else {
            return n%2 + calculateBinary(n/2)*10;
        }

    }


    public static void main(String[] args) {
        System.out.println(calculateBinary(13));
    }

}
