package test;

import java.util.ArrayList;

public class FindOutput {

    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList<>();

        arrayList.add("Hello");
        arrayList.add(42);

        for (Object item : arrayList) {
            if (item instanceof String) {
                System.out.println(item);
            } else if (item instanceof Integer) {
                System.out.println(item);

            }
        }
    }
}
