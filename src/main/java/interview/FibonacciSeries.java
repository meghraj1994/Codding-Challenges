package interview;

public class FibonacciSeries {

    int input;

    public FibonacciSeries(int input) {
        this.input = input;
    }

    public static void main(String[] args) {

        FibonacciSeries fb = new FibonacciSeries(25);

        for (int i=0; i<=25; i++) {
            System.out.println(fb.printFib(i));
        }

    }

    public int  printFib(int n) {

        //base case
        if(n<=1) return n;

            return printFib(n - 2) + printFib(n - 1);
        }
}


