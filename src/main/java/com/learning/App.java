package com.learning;


import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */


public class App 
{
    public static class LearnGarbage{
        String name ;
        LearnGarbage(String name){
            this.name = name ;
        }

        protected  void finalize() throws  Throwable{
            System.out.println("object is destroyed");
        }
    }
    public static class Student{
        private String name = "pravakar";
        int rollNo ;
        double marks;

        Student(String name , int rollNo , double marks){
            this.name = name;
            this.rollNo = rollNo;
            this.marks = marks;
        }
        Student(String name,int rollNo){
            this.name = name;
            this.rollNo = rollNo;
        }

        public double giveName(){
            return this.marks;
        }
    }
    public static class History extends Student{

        History(String name, int rollNo, double marks) {
            super(name, rollNo, marks);
        }
        History(String name ,int rollNo ){
            super(name,rollNo);
        }

        public void iterate(){

        }
    }
    public static void main( String[] args )
    {
//        Student[] students = new Student[5];
//        for(int i=0 ; i < 5 ; i++)
//            System.out.println(students[i]);
//        ArrayList<int> x = new ArrayList<>();
        History hist = new History("pravakar",12 );
        double getValue = hist.giveName();
        System.out.println(getValue);

        final String pravakar = "You are Dumb";
        LearnGarbage hello ;
        for(int i =0; i < 1e9 ; i ++){
            hello = new LearnGarbage("Big Dumb");
        }
    }


}
