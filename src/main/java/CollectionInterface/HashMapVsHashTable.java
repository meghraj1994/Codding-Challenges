package CollectionInterface;

import java.util.Hashtable;
import java.util.Map;

public class HashMapVsHashTable {

    Map<String,String> state = new Hashtable<>();

    public  void stateWithCode() {
        state.put("Karnataka","KA");
        state.put("Karasdasaka","pA");
        state.put("Karnaaasdastaka","cA");
        state.put("Karnataka","KA");
        state.put("Karnataka","KA");

//        state.put(null,"AP");
//        state.put(null,"TN");
//        state.put("Goa",null);
//        state.put("Bihar",null);
        System.out.println(state.size());
    }

    public static void main(String[] args) {
        HashMapVsHashTable  hm = new HashMapVsHashTable();
        hm.stateWithCode();
        for(Map.Entry<String,String> entry : hm.state.entrySet()) {
            System.out.println("Detals :"+entry.getKey()+" "+entry.getValue());
        }

    }




}
