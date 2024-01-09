package apreparingforinterview;

public class Test {


    public static void main(String[] args) {
      String[] strs1 = {"flower","flow","flight"};
      String[] strs2 = {"dog","racecar","car"};

        System.out.println(longestCommonPrefix(strs1));
        System.out.println(longestCommonPrefix(strs2));


    }
        public static String longestCommonPrefix(String[] strs) {
            if(strs.length == 0) return "";
            String newString = strs[0];
            for(int i = 1 ; i< strs.length ; i++) {
                int p1=0;
                while(p1<newString.length() && p1<strs[i].length() &&
                        newString.charAt(p1) == strs[i].charAt(p1)) {
                    p1++;
                }
                if(p1 == 0) return "";

                newString = newString.substring(0,p1);
            }
            return newString;
        }
    }










