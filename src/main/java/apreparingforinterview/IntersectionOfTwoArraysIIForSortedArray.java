package apreparingforinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntersectionOfTwoArraysIIForSortedArray {
    public static void main(String[] args) {

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
//        Output: [2,2]

        int[] nums3 = {4,9,5};
        int[] nums4 = {9,4,9,8,4};
//        Output: [4,9]
//        Explanation: [9,4] is also accepted.
        System.out.println(Arrays.toString(intersectSorting(nums1,nums2)));
        System.out.println(Arrays.toString(intersectSorting(nums3,nums4)));
    }

    public static int[] intersectSorting(int[] nums1, int[] nums2) {
          int p1=0;
          int p2=0;
          Arrays.sort(nums1);
          Arrays.sort(nums2);
        List<Integer> newList = new ArrayList<>();
          while(p1<nums1.length && p2<nums2.length) {
              if(nums1[p1] == nums2[p2]) {
                  newList.add(nums1[p1]);
                  p1++;
                  p2++;
              } else if(nums1[p1] > nums2[p2]) {
                  p2++;
              } else {
                  p1++;
              }
          }
          return newList.stream().mapToInt(i->i).toArray();
    }

}
