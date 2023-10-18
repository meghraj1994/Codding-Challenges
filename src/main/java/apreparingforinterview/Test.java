package apreparingforinterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test  {

    public static void main(String[] args) {


        int[] intArray = {1,2,3,4,5,6};
        System.out.println(isUnique(intArray));
        test();

    }

    public static boolean isUnique(int[] intArray) {
        for(int i=0; i<intArray.length;i++){
            int index = Math.abs(intArray[i])-1;

            if(intArray[index] < 0){
                return true;
            } else {
                intArray[index] = - intArray[index];
            }
        }
        return false;
    }

    public static void test() {
        List<Integer> arrList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        arrList1.add(2,9);
        System.out.println(arrList1);


        int[] arr = new int[]{1,2,3};
         arr[1] = 9;
        System.out.println(Arrays.toString(arr));
    }
}



