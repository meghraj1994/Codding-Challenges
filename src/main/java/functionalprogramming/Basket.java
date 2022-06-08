package functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class Basket<T> {

    public int length;
    public int width;
    public int height;
    public List<T> items = new ArrayList<>();

    public void addItem(T item) {
        this.items.add(item);
    }


    public List<T> getItemList() {
        return this.items;
    }
}
