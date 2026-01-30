package blind75;

public class Q29CountAndSay {
    public static void main(String[] args) {
        int n=1;  //"1"
        int n2=4; // "1211"
        System.out.println(coundAndSay(4));
    }

    public static String coundAndSay(int n){

        if(n==1) return "1";

        String s = coundAndSay(n-1);
        int count=0;
        StringBuilder result = new StringBuilder();

        for(int i=0; i<s.length();i++){
            count++;
            if (i ==s.length()-1 ||s.charAt(i) !=s.charAt(i+1)){
                 result.append(count).append(s.charAt(i));
                 count=0;
            }
        }
        return result.toString();


    }
}
