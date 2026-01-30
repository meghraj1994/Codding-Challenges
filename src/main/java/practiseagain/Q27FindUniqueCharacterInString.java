package practiseagain;

public class Q27FindUniqueCharacterInString {
    public static void main(String[] args) {
        String s1 = "leetcode"; // 0
        String s2 = "loveleetcode"; //2
        String s3 = "aabb"; //-1

        System.out.println(findUniqueChar(s1));
        System.out.println(findUniqueChar(s2));
        System.out.println(findUniqueChar(s3));
    }

    public static int findUniqueChar(String s) {

        int[] charCount = new int[26];

        for (char ch : s.toCharArray()) {
            charCount[(ch - 'a')]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i)-'a']==1) {
                return i;
            }
        }
        return -1;
    }
}
