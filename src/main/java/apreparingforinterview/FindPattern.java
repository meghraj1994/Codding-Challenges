package apreparingforinterview;

public class FindPattern {
    public static void main(String[] args) {

        int[] input = {1,2,3,4 };
//        int[] input = {1,2,0,4 };

        for(int i : findPattern(input)) {
            System.out.println(i);
        }
    }

    public static int[] findPattern(int[] givenArray) {
        int n = givenArray.length;
        int[] outputArray = new int[n];

        // Calculate the product of elements to the left of each index
        int productToLeft = 1;
        for (int i = 0; i < n; i++) {
            outputArray[i] = productToLeft;
            productToLeft *= givenArray[i];
        }

        // Calculate the product of elements to the right of each index
        int productToRight = 1;
        for (int i = n - 1; i >= 0; i--) {
            outputArray[i] *= productToRight;
            productToRight *= givenArray[i];
        }

        return outputArray;
    }

}
