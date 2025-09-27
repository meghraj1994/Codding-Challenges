package phase1;

public class A_Remove_Duplicates_From_An_Sorted_Array_In_Phase {

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};  //output :  5 ie length of unique array
        // [0,1,2,3,4,_,_]
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums ) {
        int count = 0;

        for(int i=0; i< nums.length;i++) {
            if(nums[i] != nums[count]){
                count++;
                nums[count] = nums[i];
            }
        }
        return count+1;
    }
}
