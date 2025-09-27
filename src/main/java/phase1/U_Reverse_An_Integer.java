package phase1;

public class U_Reverse_An_Integer {

    public static void main(String[] args) {
        int x = 123;
        System.out.println(reverseAnInteger(123));
    }

    public static int reverseAnInteger(int x) {

        int reversed = 0;
        while(x!=0){
            int temp = x%10;
            x = x/10;

            if(reversed>0 && reversed>(Integer.MAX_VALUE-temp)/10 || reversed<0 && reversed<(Integer.MIN_VALUE-temp)/10) return 0;
            reversed = reversed*10+temp;
        }
        return reversed;
    }
}
