package practiseagain;

public class Q1RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int p1=0;
        for(int i=1;i<nums.length;i++){
           if(nums[i]!=nums[p1]){
               p1++;
               nums[p1]=nums[i];
           }
        }
        return p1+1;
    }
}
