package neetcode.practice;

public class Q23ValidAnagram {

    public static void main(String[] args) {
        String s1 = "anagram";
        String t1 = "nagaram";
        String s2 = "rate";
        String t2 = "car";

        System.out.println(isValidAnagram(s1, t1));
        System.out.println(isValidAnagram(s2, t2));
    }

    public static boolean isValidAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[26];
        for(int i=0; i<s.length();i++){
           count[s.charAt(i)-'a']++;
           count[t.charAt(i)-'a']--;
        }

        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)-'a'] !=0){
                return false;
            }
        }
//        for(int i=0;i<26;i++){
//            if(count[i] !=0){
//                return false;
//            }
//        }
        return true;
    }
}
