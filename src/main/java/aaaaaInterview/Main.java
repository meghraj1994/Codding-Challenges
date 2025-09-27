package aaaaaInterview;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {

    public static void main(String[] args) throws Exception {
        StringBuilder inputData = new StringBuilder();
        String thisLine = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ((thisLine = br.readLine()) != null && !thisLine.isEmpty()) {
            inputData.append(thisLine + "\n");
        }
        // Output the solution to the console
        System.out.println(codeHere(inputData));
    }

    public static String codeHere(StringBuilder inputData) {
        String[] lines = inputData.toString().split("\n");
        int n = Integer.parseInt(lines[0].trim()); // The upper limit number
        int k = Integer.parseInt(lines[1].trim()); // The digit to count

        int count = 0;
        for (int i = 0; i <= n; i++) {
            count += countDigitOccurrences(i, k);
        }

        return String.valueOf(count);
    }

    private static int countDigitOccurrences(int number, int digit) {
        int count = 0;
        String strNum = String.valueOf(number);
        char charDigit = Character.forDigit(digit, 10);

        for (char c : strNum.toCharArray()) {
            if (c == charDigit) {
                count++;
            }
        }

        return count;
    }
}

