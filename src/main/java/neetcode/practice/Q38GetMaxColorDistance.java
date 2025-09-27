package neetcode.practice;

import java.util.HashMap;
import java.util.Map;

public class Q38GetMaxColorDistance {
    public static void main(String[] args) {

        String[] colors1 = {"red", "green", "blue", "red", "green", "red"};
        String[] colors2 ={"green"};

        System.out.println(findMaxDistance(colors1));
        System.out.println(findMaxDistance(colors2));
    }

    public static int findMaxDistance(String[] colors) {
        Map<String, Integer> map = new HashMap<>();
        int maxDistance = 0;
        for (int i = 0; i < colors.length; i++) {
            if (map.containsKey(colors[i])) {
                int distance = i - map.get(colors[i]);
                maxDistance = Math.max(maxDistance, distance);
            } else {
                map.put(colors[i], i);
            }
        }
        return maxDistance;
    }
}
