package phase1;

public class T_Reverse_An_String_In_Place {

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseAnArray(s);
    }

    public static void reverseAnArray(char[] chars) {
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        for (char ch : chars) {
            System.out.print(ch + " ");
        }
    }


}
