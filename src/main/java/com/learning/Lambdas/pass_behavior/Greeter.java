package com.learning.Lambdas.pass_behavior;

public class Greeter {
    public void greet(Greeting greeting){
        greeting.perform();
    }
    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);

        /**
         * Lambda Function
         * Need to create an interface and implement function with same structure
         */

        myLambda myLambdaFunction = () -> System.out.println("Lambda Function");
        myAdd addFunction = (int a , int b) -> a + b ;

        /**
         * changing to Greeting interface
         */
        Greeting myLambdaGreeting = () -> System.out.println("From Greeting Interface");

        /**
         * Difference between --
         * HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
         * Greeting myLambdaGreeting = () -> System.out.println("From Greeting Interface");
         * shortcut to create new inner class but there is difference between inner class and anonymous
         * inner class
         */


        /**
         * Anonymous inner class
         *
         */

        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("From inner Class");
            }
        };

    }
    interface myLambda{
        void foo();
    }
    interface myAdd{
        /**
         *
         * Only one function -> for using this as lambda expression
         */
        int add(int x,int y);
    }
}
