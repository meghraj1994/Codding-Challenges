package apreparingforinterview.mutlithreading.executorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        int noOfThread = 3;

        //creating thread pool
        ExecutorService service = Executors.newFixedThreadPool(noOfThread);

        List<Future> futureList = new ArrayList<>();
        //submitting task to thread pool
        for(int i=0; i<=100; i++) {
            Future<Integer> futures = service.submit(new Task());
            futureList.add(futures);
        }

        for(Future<Integer> future : futureList){
            //this get operation is blocking operation, and it will not let go to other until future returns
            int num = future.get(1, TimeUnit.SECONDS);
            System.out.println(num);
        }



    }

    static class Task implements Callable<Integer> {
        @Override
        public Integer call() throws Exception {
            Thread.sleep(3000);
            return new Random().nextInt();
        }
    }
}
