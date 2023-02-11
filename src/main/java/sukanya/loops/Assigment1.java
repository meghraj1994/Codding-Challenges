package sukanya.loops;

public class Assigment1 {

    public static void main(String[] args) {
    int [] input = {1,2,4,5,6,7,8};

        System.out.println(sumOfArray(input));

    }

    //given an array of integers, print the sum of array using for and forEach loop
    //print each element of array using for and forEach loop


    public static int sumOfArray(int[] nums){
        int sum= 0;

        for(int i=0;i<nums.length;i++){

            sum +=nums[i];

        }
        return sum;

    }


}
