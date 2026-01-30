package blind75;

import java.util.HashSet;
import java.util.Set;

public class Q15IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};             //[2] ====> duplicates not allowed

        int[] nums3= {4,9,5};
        int[] nums4={9,4,9,8,4};       //[4,9]


        System.out.println();
        System.out.println("-------Using set------");

        for(int i: intersectUsingSet(num1,num2)){
            System.out.print(i+" ");
        }
        System.out.println();

        for(int i: intersectUsingSet(nums3,nums4)){
            System.out.print(i+" ");
        }

    }

    public static int[] intersectUsingSet(int[] num1, int[] num2){

        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        for(int num : num1){
            set.add(num);
        }

        for(int num : num2){
            if(set.contains(num)){
                result.add(num);
            }
        }

        return result.stream().mapToInt(i->i).toArray();
    }
}
