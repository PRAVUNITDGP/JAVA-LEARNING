package com.learning.MultiThreadConcur;

public class VirtualThread {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            for(int i=0 ; i < 100 ; i++){
                System.out.println("Index is : " + i);
            }
        };

    }


}
