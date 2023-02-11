package sukanya.learning;

public class powerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(6));
    }
//        public static boolean isPowerOfTwo(int n) {
//            float m = n;
//            if(n==1) return true;
//            if(n%2 != 0) return false;
//
//            while(m>=0) {
//                if(m%2 != 0) {return false;}
//                if(m==0) {return true;}
//                m=n/2;
//            }
//            return false;
//        }
//public static boolean isPowerOfTwo(int n) {
//    if (n <= 0) {
//        return false;
//    }
//    while (n % 2 == 0) {
//        n /= 2;
//    }
//
//    return n == 1;
//}
//    public static boolean isPowerOfTwo(int n) {
//        if (n <= 0) {
//            return false;
//        }
//        return (n & (n - 1)) == 0;
//    }
public static boolean isPowerOfTwo(int n) {
    if(n<=0) return false;
    if(n==1) return true;
    if(n%2 != 0) return false;
    isPowerOfTwo(n/2);
    return true;
}
    }

