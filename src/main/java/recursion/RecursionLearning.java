package recursion;

public class RecursionLearning {


   static void resursionMethod(int n) {
       if(n<1){
           System.out.println("n is less than 1");
       } else {
            resursionMethod(n-1);
           System.out.println(n);
       }

   }

   static int powerOfTwo(int n) {
       if(n==0) {
          return 1;
       } else {
           int power = 2*powerOfTwo(n-1);
           return power;
       }
   }

   static int calculateFactorial(int n){
   if(n<0){
       return  -1;
   }


       if(n == 1) {
           return 1;
       } else {
           int factorial = n * calculateFactorial(n-1);
           return factorial;
       }
   }

   //fibonacci number

    static int fibonacciNumber(int n){
       if(n <0 ) return -1;
       if(n==0 || n== 1){
           return n;
       }
       return fibonacciNumber(n-1)+fibonacciNumber(n-2);
   }


    public static void main(String[] args) {

//       resursionMethod(4);
//        System.out.println(powerOfTwo(4));
//        System.out.println(calculateFactorial(4));
//        System.out.println(calculateFactorial(10));
//        System.out.println(calculateFactorial(-10));
        System.out.println(fibonacciNumber(5));
        System.out.println(fibonacciNumber(6));
        System.out.println(fibonacciNumber(11));


    }
}
