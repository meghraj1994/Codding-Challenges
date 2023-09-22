package java8features.lamba.passlambdaexpressionasmethodparams;

public class Runner {

    public static void main(String[] args) {

//        Addition add = (a,b) -> (a+b);
//        System.out.println(add.add(2, 4));

        print((a,b)->(a+b));

    }

    static void  print(Addition addition) {
        System.out.println(addition.add(4, 5));
    }

}
