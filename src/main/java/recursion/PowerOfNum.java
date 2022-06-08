package recursion;

public class PowerOfNum {


    public static int powerOfNum(int x, int n) {
        int powOfNum = 0;
        if (n == 0) {
            return 1;
        } else {
            return x * powerOfNum(x, n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(powerOfNum(2, 3));
    }
}
