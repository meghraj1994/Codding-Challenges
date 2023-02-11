package mapandflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Customers {


    public  static List<Customer> getAllCustomer() {

        return Stream.of(
                new Customer("Meghraj","meghrajp@gmail.com", Arrays.asList(65123321,653424425,625344234)),
                new Customer("Sukanya","sukanya@gmail.com", Arrays.asList(75123321,73424425,725344234)),
                new Customer("Rama","ramap@gmail.com", Arrays.asList(65123321,653424425,625344234)),
                new Customer("Hari","hari@gmail.com", Arrays.asList(85123321,853424425,825344234)),
                new Customer("Mohan","mohanp@gmail.com", Arrays.asList(95123321,953424425,925344234)),
                new Customer("Garry","garry@gmail.com", Arrays.asList(55123321,553424425,525344234)),
                new Customer("john","john@gmail.com", Arrays.asList(45123321,453424425,425344234))
        ).collect(Collectors.toList());
    }


}
