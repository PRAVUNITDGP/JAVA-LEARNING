package com.learning.Lambdas.pass_behavior;

public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLambda myLambda = (String s) -> s.length();
        /*
            We can remove type in argument
            (s) -> s.length();
            If one argument is there , then we can remove brackets
            s -> s.length();
         */
        System.out.println(myLambda.getLength("Hello lambda"));

        printLambda(s->s.length());
    }
    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("hello from lambda short cut"));
    }
    interface StringLengthLambda{
        int getLength(String s);
    }
}
