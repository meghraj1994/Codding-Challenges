package apreparingforinterview;

public class MaxDifferenceBetweenGivenArray {
    public static void main(String[] args) {
      int[] input = {7,6,5,4,3,17};
      int[] input2 = {9,4,3,2};
        System.out.println(findMaxDifference(input));
        System.out.println(findMaxDifference(input2));
    }

    public static int findMaxDifference(int[] input) {

        int minValue = input[0];      // min = 7
        int maxDifference = -1; // maxDiff = 6-7 = -1

        for(int i=1; i<input.length; i++) {
            if(input[i] > minValue) {
                int currentDiff = input[i] - minValue;
                maxDifference = Math.max(maxDifference,currentDiff);
            } else {
                minValue = input[i];
            }
        }
        return maxDifference>=0 ? maxDifference : -1;
    }
}
