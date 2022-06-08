package sukanya.day2;


import javax.lang.model.element.Name;

class  student{
    int id;
    String studentName;
    String gender;
   int  computecount;

   //how to delcare static variable
    public static String nationality;

    //method1
    void  compute(int id, String studentName){
        computecount++;
        int nextId=id+1;

        System.out.println("id: " +id);
        System.out.println("studentname:" +studentName);
        System.out.println(computecount );


    }

    //to make static method


    public static void printName(String name) {
        nationality = " India";
        System.out.println(name);
    }

    public static void main(String[] args) {

        student s = new student();
        System.out.println(s.studentName = "soundu");
        s.id =1000;


        student s1 = new student();
        s1.studentName = "soundu";
        s1.id =1000;




       /* VVVI : if a property or a method is type static then we no need to create object of that class to access
        that method or property, we can just access it by ClassName.property or ClassName.methodName */

        student.printName("Sukanya");
        System.out.println(student.nationality = "India");


    }
}







