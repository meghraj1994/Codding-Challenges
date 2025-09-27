package neetcode.practice;

public class Q20ReverseAStringInPlace {

    public static void main(String[] args) {
        char[] string = {'h','e','l','l','o'};

        for(char ch : reverseAnString(string)){
            System.out.print(ch+" ");
        }
    }

    public static char[] reverseAnString(char[] chars){
        int start=0;
        int end=chars.length-1;
        while (end>start){
            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            start++;
            end--;
        }
        return chars;
    }
}
