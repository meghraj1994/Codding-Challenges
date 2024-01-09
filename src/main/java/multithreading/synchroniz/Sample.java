package multithreading.synchroniz;



public class Sample {

    static  int a =10;
    int b= 5;

    // is this method is thread safe ?   --> no
    public synchronized void increment() {
        a++;
        b++;

    }


}
