package course;

import java.util.HashMap;

public class NumberOfGoodPair {

    public static void main(String[] args) {

    }

    public int numIdenticalPairs(int[] nums) {
        int counter =0;
        HashMap<Integer,Integer> map = new HashMap();
      for(int n : nums) {
          map.put(n,1+map.getOrDefault(n,0));
      }
      for(int n : map.values()){
          counter+=n*(n-1)/2;
      }
      return counter;
    }

}
