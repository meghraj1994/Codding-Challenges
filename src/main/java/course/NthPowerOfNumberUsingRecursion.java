package course;

public class NthPowerOfNumberUsingRecursion {
    public static void main(String[] args) {
        System.out.println(findNthPower(2, 5));
    }

    public static int findNthPower(int b, int e) {
        if(e==0) return 1;
        if(e<0) return -1;
        return b * findNthPower(b,e-1);

    }
}
