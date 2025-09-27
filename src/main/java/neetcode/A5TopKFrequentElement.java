package neetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class A5TopKFrequentElement {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k=2;    //output = [1,2]


        int[] nums1 = {1};
        int k1 = 1;  //output=[1]

        for(int num : findTopKFrequentElement(nums,k)){
            System.out.print(num+ " ");
        }

    }

    public static int[] findTopKFrequentElement(int[] nums, int k){

        Map<Integer,Integer> map = new HashMap<>();

        //store key and its frequency in hashMap
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        Queue<Integer> pq = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));

        for(int i : map.keySet()){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] result = new int[k];
        for(int i =0;i<k;i++){
            result[i]=pq.poll();
        }


        return result;
    }
}
