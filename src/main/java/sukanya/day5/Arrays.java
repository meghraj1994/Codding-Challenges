package sukanya.day5;

public class Arrays {

    public static void main(String[] args) {
        int[] score = {40, 50, 60, 70};
        System.out.println(productOfArray(score));
        int[] price = {1, 2, 3, 4};
        System.out.println(sumOfArray(price));

        //Addingone to each//
        int[] array = {5, 7, 9, 1, 2};

        //enhance for loop
        for (int i : addOneToArray(array)) {
            System.out.print(i + " ");
        }

        System.out.println();
        //subtracing//
        int[] diff = {5, 7, 9, 1, 2};

        for (int i :subtraction(diff)){
            System.out.print(i+" ");
        }


    }

    static int productOfArray(int[] score) {

        int product = 1;
        for (int i = 0; i < score.length; i++) {
            {
                product *= score[i];

            }

        }
        return product;
    }

    static int sumOfArray(int[] score) {
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum;
    }

    static int[] addOneToArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 1;
        }
        return array;

    }

    //subtracting one from each element
    static int[] subtraction(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] -=1;
//            inputArray[i] = inputArray[i]-1;
        }
        return inputArray;
    }
}








