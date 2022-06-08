package sukanya.day3;

public class Addition {
    public int number1;
    public int number2;
    int number3=1;

    public int additionOfNumbers(int number1,int number2){
        this.number1= number1 + number2+ this.number3;

         return this.number1;

    }

    public void check(){
        System.out.println(number1);
        System.out.println(number2);
    }

    public static int multiplicationOfTwoNumbers(int number1,int number2){
        int multiplication= number1*number2;
        System.out.println(multiplication);
        return multiplication;



    }

    public static void main(String[] args) {
        Addition a =new Addition();
        System.out.println(a.additionOfNumbers(2, 2));
        a.check();

//        ------------------------------------------
        multiplicationOfTwoNumbers(2,3);

        Addition addition = new Addition();
        System.out.println(addition.number1);

    }


}
