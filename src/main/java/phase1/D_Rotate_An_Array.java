package phase1;

public class D_Rotate_An_Array {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7}; // output = 5,6,7,1,2,3,4
        int k=3;

        rotateAnArray(nums,3);
    }

    public static void rotateAnArray(int[] nums, int k) {

        int n= nums.length;
        int[] arr = new int[n];

        for(int i=0; i<nums.length;i++){
            arr[i] =nums[i];
        }

        // 0 ->3
        //1->4
        //2->5
        //3->6
        //4->0
        //5->1
        //6 ->2
        //case study :
        /*
        * (0+3)%7 = 3
        * (1+3)%7 = 4
        * */
        for(int i=0; i<nums.length;i++){
            nums[(i+k)%n] = arr[i];
        }

         for(int num : nums){
             System.out.print(num+" ");
         }
    }

}
