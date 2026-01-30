package practiseagain;

public class Q29ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: panama"; // true
        String s1 = ""; // false

        System.out.println(isValidAnagram(s));
        System.out.println(isValidAnagram(s1));
    }

    public static boolean isValidAnagram(String s) {

        if(s.isEmpty()){
            return false;
        }
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                sb.append(ch);
            }
        }

        String cleanString = sb.toString();

        int start = 0;
        int end = cleanString.length() - 1;

        while (start < end) {
            if  (cleanString.charAt(start)!= cleanString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
