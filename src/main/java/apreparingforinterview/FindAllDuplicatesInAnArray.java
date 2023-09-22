package apreparingforinterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllDuplicatesInAnArray {

    public static void main(String[] args) {
//        Example 1:
        int[] nums1 = {4,3,2,7,8,2,3,1}; //Output: [2,3]

        //        Example 2:
        int[] nums2 = {1,1,2};   // Output: [1]

//        Example 3:
        int[] nums = {1};    // Output: []

        for (int i : findDuplicates(nums)){
            System.out.print(i+" ");
        }


    }

    public static List<Integer> findDuplicates(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> duplicates = new ArrayList<>();

        for(int i : nums) {
           map.put(i, map.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if(entry.getValue()==2) duplicates.add(entry.getKey());
        }
        return duplicates;
    }
}
