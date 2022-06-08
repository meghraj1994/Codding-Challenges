package multithreading;

public class Company {

    int n;
    boolean f= false;

    //if f=false: chance:producer

    synchronized public void produce_Item(int n){
       this.n = n;
        System.out.println("produced :"+this.n);
    }

     synchronized public int consume_Item(){
        System.out.println("consumed:"+this.n);
        return this.n;
    }
}
