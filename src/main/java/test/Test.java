package test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class Test {


    public static void main(String[] args) {

//      String str = "Meghraj";
//      str = "Mega";
//
//        System.out.println(str);

//        System.out.println(new Date().toString());
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Calendar cal = Calendar.getInstance();
//        System.out.println(dateFormat.format(cal.getTime()));
//        cal.add(Calendar.DATE, 30);
//        System.out.println(dateFormat.format(cal.getTime()));

        Employee e = new Employee("Meghraj", "Prasad", "Kurmi");
        System.out.println(e);
    }

//    public static String testDate() {
//
//        Date currentDate = new Date();
//
//        return Optional.of(currentDate)
//                .map(date -> {
//                    Calendar cal = Calendar.getInstance();
//                    cal.setTime(date);
//                    cal.add(Calendar.DATE,30);
//                    return cal.getTime().toString();
//                })
//                .orElse(null);
//
//    }




}
