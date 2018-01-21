package pancakeHouse;

import bar.Iterator;

import java.util.ArrayList;

/**
 * Created by Professional on 2018-01-19.
 */
public class PancakeHouseMenuIterator  implements Iterator{
    ArrayList items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    public Object next() {
        Object object = items.get(position);
        position = position + 1;
        return object;
    }

    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }
}
