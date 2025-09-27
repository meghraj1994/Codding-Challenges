//package aaaaaInterview;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class WalmartInterview {
//
//    public static void main(String[] args) {
//        System.out.println("Hello Meghraj");
//
//         String s = "a123321a";  // true
//         String s1 = "a1;23;21a"; //true
//        System.out.println(isValidPalindrome(s));
//        System.out.println(isValidPalindrome(s1));
//    }
//
//    public static boolean isValidPalindrome(String s) {
//        int counter=0;
//        char[] chars = s.toCharArray();
//        StringBuilder s1= new StringBuilder();
//        for(int i=s.length()-1; i<0;i++){
//            if(Character.isLetterOrDigit(s.charAt(i)) && Character.isLetterOrDigit(s.charAt(counter))){
//                s1.append(s.charAt(i));
//                if(s.charAt(counter) !=s1.charAt(i)){
//                    return false;
//                }
//                counter++;
//            }
//
//            return true;
//        }
//
//
//
//        Character[] chars = new Character[s.length()];
//        List<Character> characters = new ArrayList<>();
//
//        StringBuilder s1= new StringBuilder();
//      for(Character ch : s.toCharArray()) {
//          if(Character.isLetterOrDigit(ch)){
//              characters.add(ch);
//          }
//      }
//
//
//      int counter=0;
//      for(int i=s.length()-1; i>=0; i--){
//          if(s.charAt(i) != s.charAt(counter)){
//              return false;
//          }
//          counter++;
//      }
//
//        return true;
//    }
//}
