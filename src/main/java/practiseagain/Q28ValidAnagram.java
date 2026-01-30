package practiseagain;

public class Q28ValidAnagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";  //true

        String s2 = "rate";
        String t2 = "car";  //false

        System.out.println(isAnagram(s, t));
        System.out.println(isAnagram(s2, t2));
    }

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] charCount = new int[26];

        for (int i = 0; i < s.length(); i++) {
            charCount[(s.charAt(i) - 'a')]++;
            charCount[(t.charAt(i) - 'a')]--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
