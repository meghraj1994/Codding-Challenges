package neetcode;

import java.util.*;

public class A4GroupAnagram {
    public static void main(String[] args) {

        String[] names = {"eat", "tea", "ate", "nat", "bat"};
        String[] names1 = {""};
        String[] names2 = {"a"};
//        groupAnagram(names).forEach(e -> System.out.println(e.toString()));
        System.out.println(groupAnagrams(names));
    }

        public static List<List<String>> groupAnagrams(String[] strs) {

            if(strs.length ==0){
                return new ArrayList();
            }

            Map<String, List> map = new HashMap<>();
            int[] count = new int[26];
            //step 1 :  iterate over each str and convert its indices increase its indices from 0 to 1
            for(String s : strs){
                Arrays.fill(count,0);
                for(char ch : s.toCharArray()) {
                    count[ch-'a']++;
                }

                //step 2: creating a string to get all chars indices and store as string as key of map
                StringBuilder sb = new StringBuilder();

                for(int i=0;i<26;i++){
                    sb.append("#");
                    sb.append(count[i]);
                }

                String key = sb.toString();
                if(!map.containsKey(key)){
                    map.put(key,new ArrayList());
                }
                map.get(key).add(s);
            }
            return new ArrayList(map.values());

        }
    }


