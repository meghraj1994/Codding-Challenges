package apreparingforinterview;

import java.sql.Array;
import java.util.Arrays;

public class RecursiveTest {

    public static void main(String[] args) {
       int[] myArray = {1, 2, 3, 4};
        System.out.println(Arrays.toString(middle(myArray)));
    }
    public static int[] middle(int[] array) {

        int[] arr = new int[array.length-2];

        for (int i=0; i<arr.length;i++){
            arr[i] = array[i+1];
        }
        return arr;

    }
}
