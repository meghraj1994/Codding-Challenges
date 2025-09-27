package neetcode.practice;

import java.util.*;

public class Q37TopKFrequentElement {

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 1, 2, 2, 3}; //output=[1,2]
        int[] nums2 = {1};           //output=[1]
        for(int n : topKFrequent(nums1,2)){
            System.out.println(n+" ");
        }
    }

    public static int[] topKFrequent(int[] nums, int k) {
        if (k == nums.length) {
            return nums;
        }

        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        Queue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(count::get));

        for (int n : count.keySet()){
          heap.add(n);
          if(heap.size()>k){
              heap.poll();
          }
        }
        int[] ans = new int[k];
        for(int i=0; i<k; i++){
           ans[i]=heap.poll();
        }
        return ans;
    }
}
