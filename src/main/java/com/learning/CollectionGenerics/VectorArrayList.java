package com.learning.CollectionGenerics;

import java.util.Vector;

/**
 * Dynamic Array
    Array list saves the memory : 50%
    vector -> 100% increase in size
    ArrayList -> Not thread safe(fast)
    vectors-> Thread safe (slow)
    Initial Capacity : 10
    doubles the size if it reaches the current size
 *
 */
public class VectorArrayList {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(8);
        v.add(8);
        v.add(7);

    }
}
