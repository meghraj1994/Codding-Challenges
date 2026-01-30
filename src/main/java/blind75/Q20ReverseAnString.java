package blind75;

public class Q20ReverseAnString {

    public static void main(String[] args) {

        String[] s = {"h","e","l","l","o"};

        reverseAnString(s);
    }

    public static void reverseAnString(String[] s){

        int start=0;
        int end=s.length-1;

        while (start <= end){
            String temp = s[start];
            s[start] = s[end];
            s[end] =temp;
            start++;
            end--;

        }

        for(String str : s){
            System.out.print(str +" ");
        }
    }
}
