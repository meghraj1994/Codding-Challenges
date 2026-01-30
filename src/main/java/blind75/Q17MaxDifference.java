package blind75;

public class Q17MaxDifference {

    public static void main(String[] args) {
        int[] nums = {7,1,5,4}; // 5-1=4
        int[] nums2 = {9,4,3,2}; // -1

        System.out.println(findMaxDiff(nums));
        System.out.println(findMaxDiff(nums2));
    }

    public static int findMaxDiff(int[] nums){

        int minValue= nums[0];
        int maxDiff=0;

        for(int num : nums){
            if(num <minValue){
                minValue=num;
            }

            maxDiff = Math.max(maxDiff,(num-minValue));

        }
        return maxDiff;
    }


}
