package blind75;

public class Q23ValidAnagram {

    public static void main(String[] args) {
        String s1= "anagram";
        String t1="nagaram";     //true


        String s2 = "rate";
        String t2 = "rat"; //false

        System.out.println(isValidAnagram(s1, t1));
        System.out.println(isValidAnagram(s2, t2));
    }

    public static boolean isValidAnagram(String s, String t){

        int[] countArray = new int[26];

        if(s.length() != t.length()) return false;

        for(int i=0; i<s.length();i++){
            countArray[s.charAt(i)-'a']++;
            countArray[t.charAt(i)-'a']--;

        }

        for(int i=0;i<26;i++){
            if(countArray[i] !=0) return false;
        }
        return true;

    }
}
