package apreparingforinterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LoopThroughMultipleHashMaps {
    public static void main(String[] args) {

        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("Meghraj", 28);
        map1.put("Sukanya",29);

        HashMap<String,Integer> map2 = new HashMap<>();
        map2.put("Apple", 4);
        map2.put("Banana", 1);

        Map<String,Integer> map3 = new HashMap<>();
        map3.put("Tyota", 48);
        map3.put("Tucson",42);

        //creating an array or list of map
        List<Map<String,Integer>> maps = new ArrayList<>();
        maps.add(map1);
        maps.add(map2);
        maps.add(map3);

        //loop through each map
        for (Map<String,Integer> map : maps) {
            System.out.println("Looping through map:");

            //loop through key-value of each map
            for (Map.Entry<String,Integer>  entry : map.entrySet()) {
                System.out.println("Key :" + entry.getKey() + ", Value :" + entry.getValue());
            }
            System.out.println();
        }
    }
}
