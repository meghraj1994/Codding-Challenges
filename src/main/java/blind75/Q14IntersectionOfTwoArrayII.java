package blind75;

import java.util.*;

public class Q14IntersectionOfTwoArrayII {
    public static void main(String[] args) {

        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};             //[2,2]

        int[] nums3= {4,9,5};
        int[] nums4={9,4,9,8,4};       //[4,9]

        for(int i: intersect(num1,num2)){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i: intersect(nums3,nums4)){
            System.out.print(i+" ");
        }


    }


    public static int[] intersect(int[] num1, int[] num2){

        Map<Integer,Integer> map= new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for(Integer num : num1){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        for(int num : num2){
            if(map.containsKey(num) && map.get(num)>0){
                result.add(num);
                map.put(num, map.get(num)-1);
            }
        }


        return result.stream().mapToInt(i->i).toArray();
    }



}
