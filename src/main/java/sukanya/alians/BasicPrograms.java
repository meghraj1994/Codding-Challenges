package sukanya.alians;

public class BasicPrograms {

    int num1;
    int num2;
    int result;
    public  BasicPrograms(){     //default constructpr//
        num1=5;
        num2=5;
    }
    public BasicPrograms(int num1,int num2){      // constructor with one parameter//
       this.num1=num1;
        this.num2=num2;
    }
public BasicPrograms(double d,int n){
        num1=(int)d;
        num2=n;

}

    public static void main(String[] args) {
        BasicPrograms bp= new BasicPrograms(4,5);   //constructor//
        System.out.println(bp.num1);
        System.out.println(bp.num2);
    }


}




