package blind75;

import java.util.*;

public class Q6FindAllDuplicatesFromAnArray {

    public static void main(String[] args) {

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1}; // 2,3
        int[] nums1 = {1, 1, 2}; //1
        int[] nums3 = {1}; // o/p= []

        for (Integer num : findDuplicatesUsingMap(nums)) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (Integer num : efficientWay(nums)) {
            System.out.print(num + " ");
        }


    }

     //way1 using map

    public static List<Integer> findDuplicatesUsingMap(int[] nums){

        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(Integer num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==2){
                result.add(entry.getKey());
            }
        }
        return result;
    }

    //set 1<= nums[i] <=n
    public static List<Integer> efficientWay(int[] arr){


        List<Integer> result = new ArrayList<>();
        for(int i=0 ;i < arr.length;i++){
            int index = Math.abs(arr[i])-1;

            if(arr[index] < 0) result.add(Math.abs(arr[i]));
            arr[index] = -arr[index];


        }
        return result;

    }



}
