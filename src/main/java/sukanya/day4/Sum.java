package sukanya.day4;

public class Sum {

    //variables or properties     ---what a class can have

    //type 1 : instance variable        --- if you donot initialize it will take defualt value

//    public  int number1;
//    public int number2 = 3;


    //type 2 : static variable
//    public static int number3;
//    public static int number4;


    //type 3 : local variable ---which will be inside method after that it should be initialized


    //methods ----what a class can do

    public static int sumOfNum(int number1, int number2){

      return number1+number2;
    }


    public static int sumOfGivenArray(int[] nums){

        // nums = [1,2,3,4,6,8,9]
        int sum=0;

        for(int i=0; i<nums.length;i++){
            sum +=nums[i];
        }
        return sum;
    }

public static int productOfArray(int[]nums){
    int mul=1;
    for(int i=0;i<nums.length;i++){
        mul *=nums[i];

    }
    return mul;
}


    //main method - whatever you call here that only will get executed

    public static void main(String[] args) {

        System.out.println(sumOfNum(1, 2));

        int[] givenArray = {1,2,3,4,5,6,7,87,8,8,89,9,9,9,9,};

        System.out.println(sumOfGivenArray(givenArray));

        int[] product={1,2,3};

        System.out.println(productOfArray(product));


    }



}
