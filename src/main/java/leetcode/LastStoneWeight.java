package leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStoneWeight {

    public static void main(String[] args) {

        int[] stones1 = {2,7,4,1,8,1};
//        Output: 1

        int[] stones2 = {1};
//        Output: 1

        System.out.println(lastStoneWeight(stones1));
        System.out.println(lastStoneWeight(stones2));

    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for(int n:stones){
            priorityQueue.add(n);
        }

//        PriorityQueue = {8,7,4,2,1, 1}


        while (priorityQueue.size()>1){
            int firstLargestStone = priorityQueue.remove();  //firstLargestStone = 8
            int secondLargestStone = priorityQueue.remove(); //secondLargestStone = 7

            if(firstLargestStone != secondLargestStone){
                priorityQueue.add(firstLargestStone-secondLargestStone);  //PriorityQueue = {4,2,1, 1, 1}
            }
        }

        return priorityQueue.isEmpty() ? 0 : priorityQueue.remove();
    }


}
