package com.learning.CollectionGenerics;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class setInterface {
    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>(); // stores in different order based on hashFuncion
        Set<Integer> valuesSet = new TreeSet<>() ;  // keeps in order
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(18);
        values.add(9);


    }
}
