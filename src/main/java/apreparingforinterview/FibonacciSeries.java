package apreparingforinterview;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate

        System.out.println("Fibonacci Series (First " + n + " numbers):");
        for (int i = 0; i < n; i++) {
            int fib = fibonacci(i);
            System.out.print(fib + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}

