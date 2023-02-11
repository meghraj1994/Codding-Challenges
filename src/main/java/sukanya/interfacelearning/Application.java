package sukanya.interfacelearning;

public class Application {

    public static void main(String[] args) {

        int[] input = {1,2,3,4,5};
        System.out.println(findSecondLargest(input));
    }

    public static int findSecondLargest(int[] numbers){
        int largestNumber = -1;
        int secondLargestNumber = -1;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]>largestNumber){
                secondLargestNumber=largestNumber;
                largestNumber=numbers[i];

            } else if (numbers[i] != largestNumber && numbers[i] > secondLargestNumber ) {
                secondLargestNumber = numbers[i];
            }
        }
        return secondLargestNumber;
    }

    }


