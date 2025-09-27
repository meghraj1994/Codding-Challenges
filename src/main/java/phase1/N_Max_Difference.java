package phase1;

public class N_Max_Difference {
    public static void main(String[] args) {
        int[] nums = {7,1,5,4};    //output = 5-1=4
        int[] nums1 = {9,4,3,2};     // no max diff so -1

        System.out.println(findMaxDiff(nums));
        System.out.println(findMaxDiff(nums1));
    }

    public static int findMaxDiff(int[] nums){
        int min_Value = Integer.MAX_VALUE;
        int max_diff =-1;

        for(int i=0; i<nums.length;i++){
            if(nums[i]<min_Value){
                min_Value = nums[i];
            } else if(nums[i]-min_Value>max_diff){
                max_diff= nums[i]-min_Value;
            }
        }
        return (max_diff >=0 ? max_diff : -1);
    }
}
