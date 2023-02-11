package sukanya.day5;

public class MissingNumbers {

    public static void main(String[] args) {
    int[] nums = {3,0,1};
        System.out.println(findMissingTerm(nums));

int[] nums1 = {0,1};
        System.out.println(findMissingTerm(nums1));


  int[] nums2 = {9,6,4,2,3,5,7,0,1};
        System.out.println(findMissingTerm(nums2));
    }


static int findMissingTerm(int[] nums){
       int sumOfGivenArray=0;
       int n=nums.length;
       int sumOfNthNumbers =n*(n+1)/2;

       for(int i=0;i<n;i++){
           sumOfGivenArray +=nums[i];
       }
         return sumOfNthNumbers-sumOfGivenArray;

}








}