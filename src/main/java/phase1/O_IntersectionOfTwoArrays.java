package phase1;

import java.util.*;

public class O_IntersectionOfTwoArrays {
    public static void main(String[] args) {

            int[] nums1 = {1,2,2,1};
            int[] nums2 = {2,2};
              //        Output: [2,2]

            int[] nums3 = {4,9,5};
            int[] nums4 = {9,4,9,8,4};
          //        Output: [4,9]
     //        Explanation: [9,4] is also accepted.
            System.out.println(Arrays.toString(intersect(nums1,nums2)));
            System.out.println(Arrays.toString(intersect(nums3,nums4)));


        }

        public static int[] intersect(int[] nums1, int[] nums2) {

            Map<Integer,Integer> map1 = new HashMap<>();
            Map<Integer,Integer> map2 = new HashMap<>();
            List<Integer> count = new ArrayList<>();

            for(int i : nums1) {
                map1.put(i, map1.getOrDefault(i,0)+1);
            }

            for(int i : nums2) {
                map2.put(i, map2.getOrDefault(i,0)+1);
            }

            for(Map.Entry<Integer,Integer> entry : map1.entrySet()) {
                int num = entry.getKey();

                int countInNum1 = entry.getValue();
                int countInNum2 = map2.getOrDefault(num,0);

                int commonCount = Math.min(countInNum1,countInNum2);

                for(int i=0; i<commonCount; i++) {
                    count.add(num);
                }
            }
            return count.stream().mapToInt(i->i).toArray();

        }
}
