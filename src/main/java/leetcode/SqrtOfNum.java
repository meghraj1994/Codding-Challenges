package leetcode;

public class SqrtOfNum {
    /*
     * Input: x = 4 Output: 2
     * Input: x = 8 Output: 2
     */
    public static void main(String[] args) {
//        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
    }

    public static int mySqrt(int x) {

        int start = 1;
        int end = x;
        int res = 0;

        while(start <= end) {
            int mid = start+(end-start)/2;
            if(mid <=x/mid){
                res = mid;
                start = start+1;
            } else {
                end = end-1;
            }
        }
        return res;
    }
}
