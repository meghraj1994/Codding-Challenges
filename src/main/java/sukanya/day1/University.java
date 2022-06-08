package sukanya.day1;

public class University {
    public  String universityName;
    public String studentName;
    public String usnNumber;
    public int obtainedMarks;
    public String division;
    public String result;

    //Method to calculate result
    public String calculateResult(String studentName, String usnNumber, int obtainedMarks, String division,String universityName){
        result = studentName+" "+ "having"+" "+usnNumber+" "+"has obtained"+" "+(obtainedMarks*100)/1000+" "+"with"+" "+division+" "+"from"+" "+universityName;
        return result;
    }

}
