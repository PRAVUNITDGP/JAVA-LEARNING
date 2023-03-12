package com.learning.CollectionGenerics;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashInterface {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(); // no sequence uses hashCode -> Not synchronized
        Map<String,String> map2 = new Hashtable<>(); // synchronized
        map.put("myName","pravakar");
        map.put("actor","salman");
        map.put("ceo","Musk");
        System.out.println(map.get("actor"));

        for(String s : map.keySet()){
            System.out.println(map.get(s));
        }

        /**
         *  Map.Entry()
         */

        Set<Map.Entry<String,String>> values = map.entrySet();
        for(Map.Entry<String,String> e : values) {
            System.out.println(e.getKey() + ":" + e.getValue());
            e.setValue("III");
        }

    }
}
