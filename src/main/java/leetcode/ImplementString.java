package leetcode;

public class ImplementString {
    /*
    * Input: haystack = "hello", needle = "ll" Output: 2
    * Input: haystack = "aaaaa", needle = "bba" Output: -1
    * Input: haystack = "", needle = ""Output: 0
     */

    public static void main(String[] args) {
        String haystack1 = "hello"; String needle1 = "ll";
        String haystack2 = "hellowaellowiac"; String needle2 = "llowi";
        String haystack3 = "aaaaa"; String needle3 = "bba";
        String haystack4 = ""; String needle4 = "";

        System.out.println(strStr(haystack1, needle1));
        System.out.println(strStr(haystack2, needle2));
        System.out.println(strStr(haystack3, needle3));
        System.out.println(strStr(haystack4, needle4));
    }

    public static int strStr(String haystack, String needle) {
         if(needle.length()==0) return 0;

         int p1=0;
         int p2=0;
         char[] hArray = haystack.toCharArray();
         char[] nArray = needle.toCharArray();
         while (p1<hArray.length && p2<nArray.length){
             if(hArray[p1]==nArray[p2]){
                 p1++;
                 p2++;
             } else {
                 p1 = p1-p2+1;
                 p2=0;
             }
         }
         if(p2==nArray.length){
             return p1-p2;
         }
      return -1;
    }
}
