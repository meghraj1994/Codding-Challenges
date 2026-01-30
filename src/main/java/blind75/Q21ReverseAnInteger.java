package blind75;

public class Q21ReverseAnInteger {

    public static void main(String[] args) {
        int num = 123;
        int num2=2147483647;  //overflow happens
        System.out.println(reverseAnInteger(num2));
    }

    public static int reverseAnInteger(int num){

        int reversedNum=0;
        while (num !=0){
            int temp = num%10;
            num = num/10;
            if(reversedNum >0 && reversedNum > (Integer.MAX_VALUE-temp)/10
                    || reversedNum < 0 && reversedNum <(Integer.MIN_VALUE-temp)/10) return 0;
            reversedNum = reversedNum*10+temp;

        }

        return reversedNum;
    }
}
