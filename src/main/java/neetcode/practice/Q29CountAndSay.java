package neetcode.practice;

public class Q29CountAndSay {
    public static void main(String[] args) {
        int n1 = 1; //"1"
        int n2 = 2; //"11"
        int n3 = 3; //"21"
        int n4 = 4; //"1211;
        int n5=5; //"111221"
        System.out.println(countAndSay(5));
    }

    public static String countAndSay(int n) { //n==5
        if (n == 1) {return "1";}
        String s = countAndSay(n - 1); // "1211"
        int count=0;
        StringBuilder result = new StringBuilder();

        for(int i=0;i<s.length();i++){
            count++;
           if(i==s.length()-1 ||s.charAt(i) !=s.charAt(i+1)){
             result.append(count).append(s.charAt(i));
             count=0;
           }
        }
        return result.toString();
    }
}
