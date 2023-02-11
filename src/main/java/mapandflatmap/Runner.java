package mapandflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        List<Customer> customers = Customers.getAllCustomer();

//        Note 1 : Map is use for data transformation and for one to one transformation
//        Data transformation : given a stream of data and if you want to get some field value or if you want to add something to each records
        // its one to one mapping
        List<String> emails = customers.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());

        System.out.println(emails);


//        flatMap : data transformation + flattering
        // flatMap is one to many mapping
        //in map input is response is stream here its stream of stream

        //case 1 : with map
        System.out.println("without using flat map");
        List<List<Integer>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());

        System.out.println(phoneNumbers);

        //using flat map
        System.out.println("using flat map");
        List<Integer> phones = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phoneNumbers);
    }



}
