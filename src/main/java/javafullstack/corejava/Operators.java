package javafullstack.corejava;

public class Operators {


    /*
    * 1) increment and decrement operator cannot be used for boolean, constant and final datatype
    * 2) nesting of decreme nt and increment are not allowed
    *
    *
    *
    * */


    public static void main(String[] args) {


        char c = 'm';
        char ch = 'A';
        float f = 12.4f;
        final int a = 6;
        boolean b = true;
        System.out.println("post-fix- "+ c++);
        System.out.println(c);
        System.out.println("pre-fix- "+ ++c);
        System.out.println("float :- " + ++f);
        System.out.println(++ch);
//        System.out.println(++a);
//        System.out.println(b++);
    }
}
