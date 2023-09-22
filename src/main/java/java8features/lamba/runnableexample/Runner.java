package java8features.lamba.runnableexample;

public class Runner {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i=0; i<5; i++){
                System.out.println("run thread "+i);
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }

}
