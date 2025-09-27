package aaaaaInterview;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args) {

        int[] integers = {3,2,1,5,6,3,2,5,6,7};

//        sortAnyArray(integers);
        for(int i : sortAnyArrayUsingStreamApi(integers)){
            System.out.print(i + " ");
        }

        System.out.println();
        for(int i=0; i< integers.length;i++){
            System.out.print(integers[i] + " ");
        }

    }

    public static void sortAnyArray(Integer[] arr) {

         Arrays.sort(arr);
    }


    public static int[] sortAnyArrayUsingStreamApi(int [] arr) {

        int[] sortedArray = Arrays.stream(arr)      // Convert int array to IntStream
                .sorted()                       // Sort the IntStream
                .toArray();
        return sortedArray;
    }
}
