package com.learning.Lambdas.pass_behavior;

public class ThisReferenceExample {
    public  void doProcess(int i , Process p){
        p.process(i);
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        /**
         * this keyword working fine in anonymous inner class
         */
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("values of i is " + i);
                System.out.println(this);
            }
            @Override
            public String toString(){
                return "This is the anonymous inner class";
            }
        });
        /**
         * this keyword in lambda expression...Does not touch this expression
         */
        thisReferenceExample.doProcess(10 , i -> {
            System.out.println("value of i is : " + i);
            //System.out.println(this);
        } );
    }
}
