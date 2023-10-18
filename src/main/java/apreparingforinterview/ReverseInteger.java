package apreparingforinterview;

public class ReverseInteger {

    public static void main(String[] args) {
        int x =123;
        int x1=-123;
        int x2=120;
        System.out.println(reverse(x));
        System.out.println(reverse(x1));
        System.out.println(reverse(x2));
    }

    public static int reverse(int x) {
        int y=0;
        while (x!=0) {
            y = x%10;
            y = y*10+y;
        }
        return y;
    }
}
