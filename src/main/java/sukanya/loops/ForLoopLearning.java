package sukanya.loops;



//given a array of integers, add one to each integer
public class ForLoopLearning {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6};

        //for each
        for(int i : nums) {
            System.out.println(nums[i]);
        }

        sumOfOne(nums);




    }


    //method to add one to each integer of given array

    public static int[] sumOfOne(int[] nums) {

        //using for loop
        for(int i=0; i<nums.length;i++){
            nums[i] +=1;

        }


        return nums;
    }

}
