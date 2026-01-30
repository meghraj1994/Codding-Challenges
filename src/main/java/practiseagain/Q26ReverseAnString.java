package practiseagain;

public class Q26ReverseAnString {
    public static void main(String[] args) {
        String[] strings1 = {"h", "e", "l", "l", "o"};
        reverseAnString(strings1);

        for (String s : strings1) {
            System.out.print(s + " ");
        }

    }

    public static void reverseAnString(String[] input) {
        int start = 0;
        int end = input.length - 1;

        while (start < end) {
            String temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
    }
}
