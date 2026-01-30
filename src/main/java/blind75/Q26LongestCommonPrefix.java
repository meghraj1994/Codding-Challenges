package blind75;

public class Q26LongestCommonPrefix {

    public static void main(String[] args) {

        String[] str = {"flower", "flow", "flight"};

        String[] str1 = {"dog","car", "racecar"};

        System.out.println(longestCommonPrefix(str));
        System.out.println(longestCommonPrefix(str1));


    }

    public static String longestCommonPrefix(String[] str){

        if(str.length==0) return  "";
        String newString = str[0];
        for(int i=1; i<str.length;i++){
            int p=0;

            while (p<newString.length() && p<str[i].length() && newString.charAt(p) == str[i].charAt(p)){
                p++;
            }
            if(p==0) return "";
            newString = newString.substring(0,p);
        }

      return newString;
    }
}
