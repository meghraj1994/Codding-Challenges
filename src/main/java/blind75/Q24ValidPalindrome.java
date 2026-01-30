package blind75;

public class Q24ValidPalindrome {

    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal:panama";     //true
        String s2= " "; //true

        System.out.println(isValidPalindrome(s1));
        System.out.println(isValidPalindrome(s2));
    }

    public static boolean isValidPalindrome(String s){

        //step1 : convert to lowecase
        s = s.toLowerCase();

        //step2 : clean string
        StringBuilder clnString = new StringBuilder();

        for(Character ch : s.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                clnString.append(ch);
            }
        }

        //we have clean and lowercase string
        String cleanString  = clnString.toString();
        int left=0;
        int right=clnString.length()-1;

        while (left <right){
            if(cleanString.charAt(left) != clnString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
