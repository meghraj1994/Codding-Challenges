package phase1;

public class Zc_Count_And_Say {

    public static void main(String[] args) {
        int n = 1; //output = "1";
        int n1 = 4; //output="1211"

        System.out.println(countAndSay(1));
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        if (n == 1) return "1";

        String s = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            counter++;
            if (i == s.length() - 1 || (s.charAt(i) != s.charAt(i + 1))) {
                result.append(counter).append(s.charAt(i));
                counter = 0;
            }
        }
        return result.toString();
    }
}
