package CollectionInterface;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {



    public static void main(String[] args) {

        Queue<Integer> pq = new LinkedList<>();
        pq.add(2);
        pq.add(1);
        pq.add(4);
        pq.add(9);

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }

}
