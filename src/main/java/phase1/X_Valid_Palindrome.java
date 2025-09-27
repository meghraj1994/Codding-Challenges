package phase1;

public class X_Valid_Palindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal:panama"; //output is true

        System.out.println(isValidPalindrome(s));
    }

    public static boolean isValidPalindrome(String s) {

        //step1 : convert to lower case
        s = s.toLowerCase();

        //step2 : remove all alpha-numeric character
        StringBuilder cleanString = new StringBuilder();

        for (Character ch : s.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                cleanString.append(ch);
            }
        }

        //step3 : check it is valid palindrome or not
        String cleaned = cleanString.toString();
        int start = 0;
        int end = cleaned.length() - 1;

        while (start < end) {
            if (cleaned.charAt(start) != cleaned.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }


        return true;
    }
}
