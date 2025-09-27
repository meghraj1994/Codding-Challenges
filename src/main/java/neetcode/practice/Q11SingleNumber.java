package neetcode.practice;

public class Q11SingleNumber {

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(findSinleNumber(nums));

    }
    public static int findSinleNumber(int[] nums){
        int result =0;

        for(int num : nums){
            result ^=num;
        }
        return result;
    }
}
