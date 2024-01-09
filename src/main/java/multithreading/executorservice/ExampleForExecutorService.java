package multithreading.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExampleForExecutorService {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.execute(new RunnableTassTo());
        executor.execute(new RunnableTaskOne());

    }

}


//let's say you have 100 task to execute for this you cannot create 100 thread and execute them parallel
// in this you can create a thread pool of some thread size

class RunnableTaskOne implements  Runnable {

    @Override
    public void run() {
        for(int i=0 ; i< 10; i++){
            System.out.println("RunnableTask 1.....!!!!");
        }
    }
}


class RunnableTassTo implements  Runnable {

    @Override
    public void run() {
        for(int i=0 ; i< 10; i++){
            System.out.println("RunnableTask 2.....!!!!");
        }
    }
}
