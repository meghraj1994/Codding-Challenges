package multithreading.collable;


import java.util.concurrent.*;

class CalculatorUtil {
    public static int sum(int a, int b ) {
        return a+b;
    }

}

//class MyCallableTask implements Callable<Integer> {
//
//    int a, b;
//
//    public MyCallableTask(int a, int b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    @Override
//    public Integer call() throws Exception {
//        return CalculatorUtil.sum(a,b);
//    }
//}

/*
*  MyClass mc = new MyClass();
* MyClass mc = new MyClass() {};
* MyClass mc = new MyClass() {{}};
*
* */


public class CallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(1);

        Future<Integer> future = service.submit(
                new Callable<Integer>() {
                    public Integer call() {
                       return CalculatorUtil.sum(4,3) ;
                    }
                });
        //expect some other tasks to do instead of waiting for this task to complete

//        while (!future.isDone())
//            ;         // it is just waiting to complete this thread, instead we can use

                while (!future.isDone()) Thread.yield();         //Thread.yield() free cpu when thread in blocking stage
                  // it is just waiting to complete this thread, instead we can use



        Integer result = future.get();

        System.out.println(result);

    }
}
