package apreparingforinterview;

public class RotateArray {

    public static void main(String[] args) {
       //example 1
       int[] nums1 = {1,2,3,4,5,6,7};   // Output: [5,6,7,1,2,3,4]
       int k1 =3;
//       rotate(nums1,k1);

       //example 2
        int[] nums2 = {-1,-100,3,99};  //output : [3,99,-1,-100]
        int k2 = 2;

        rotate(nums2,k2);

    }

    public static void rotate(int[] nums, int k) {

        int n = nums.length;
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = nums[i];
        }

        for(int i=0; i<n;i++) {
            nums[(i+k)%n] = arr[i];
        }

        for(int i: nums) {
            System.out.print(i + " ");
        }
    }
}
