package aaaa;

import java.util.HashMap;
import java.util.Map;


@FunctionalInterface
interface InterfaceA {
    void run();
}


public class Interview {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4, 4, 8, 8};  //output =2
        System.out.println(findUniqueNumberByUsingHashMap(nums));

        System.out.println(findUniqueNumberFromAnArray(nums));

        System.out.println("move zero problem.......");
        int[] input = {1, 1, 0, 3, 12};
        int[] input1 = {0};
        for(int n : moveZeros(input)){
            System.out.print(n+" ");
        }
    }

    //way1 time complexity O(n) and space complexity O(n)
    public static int findUniqueNumberByUsingHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }

    //way2 we can improve space complexity to O(1)

    public static int findUniqueNumberFromAnArray(int[] nums) {
        System.out.println("Move Zero code...........");
        int result = 0;

        for (int n : nums) {
            result ^= n;
        }
        return result;
    }

    public static int[] moveZeros(int[] nums) {
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pointer] = nums[i];
                if(pointer !=i){
                    nums[i] = 0;
                }
                pointer++;

            }
        }
        return nums;
    }

}
