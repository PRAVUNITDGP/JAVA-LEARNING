package com.learning.CollectionGenerics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Initialization {
    public static void main(String[] args) {

        /**
         *  1 : using Array.asList
         */
        List<Integer> values1 = Arrays.asList(6,1,3,3);

        /**
         *   2 : Anonymous inner classes
         */
        List<Integer> values = new ArrayList<>()
        {{
            add(56);
            add(87);
            add(88);
            add(67);
        }};

    }
}
