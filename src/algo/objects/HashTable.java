package objects;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by username on 10/11/2015.
 */
public class HashTable {

    List<Integer> table = new LinkedList<>();

    public void chainedHashInsert(HashTable t, int x) {
        t.table.add(0, x);
    }

    public void chainedHashSearch(HashTable t, int k) {

    }
}
