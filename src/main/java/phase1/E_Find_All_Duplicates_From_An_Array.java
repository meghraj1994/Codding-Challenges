package phase1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E_Find_All_Duplicates_From_An_Array {

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1}; //output = [2,3]
        int[] nums1={1,1,2};     //output =[1]

        removeDuplicatesUsingMap(nums).stream().forEach(System.out::println);
        System.out.println("------------");
        removeDuplicatesUsingMap(nums1).stream().forEach(System.out::println);

        System.out.println("Using another way.......!!!!!!");

        removeDuplicates(nums).stream().forEach(System.out::println);
        System.out.println("-----------");
        removeDuplicates(nums1).stream().forEach(System.out::println);
    }

    public static List<Integer> removeDuplicatesUsingMap(int[] nums) {

        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();


        //storing given values in map as key-value pair
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }


        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==2){
                result.add(entry.getKey());
            }
        }

        return result;
    }


    // 1<nums[i]<=n
    /*
    * {-4,-3,-2,-7,8,2,-3,-1}
    * nums[i]= 4 => it guarantee that    1<4<=8 => 0,1,2,3
    *
    *
    * */
    public static List<Integer> removeDuplicates(int[] nums){

        List<Integer> result1 = new ArrayList<>();

        for(int i=0; i<nums.length;i++){
            int index = Math.abs(nums[i])-1;

            if(nums[index] < 0){
                result1.add(Math.abs(nums[i]));
            }
            nums[index] = - nums[index];
        }


        return result1;
    }
}
