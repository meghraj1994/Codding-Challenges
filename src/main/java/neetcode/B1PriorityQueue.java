package neetcode;

import java.util.PriorityQueue;
import java.util.Queue;

public class B1PriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(1);
        pq.add(4);
        pq.add(5);
        pq.add(2);
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        for (int num : pq) {
            System.out.print(num + " ");
        }



    }
}
