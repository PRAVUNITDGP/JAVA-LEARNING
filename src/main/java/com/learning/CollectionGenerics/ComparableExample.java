package com.learning.CollectionGenerics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3,49));
        students.add(new Student(5,48));
        students.add(new Student(2,50));
        /*
            Comparator lambda anonymous Object
         */
        Collections.sort(students , (s1, s2) -> {
            return s1.marks > s2.marks ? -1 : s1.marks < s2.marks?1 : 0 ;
        });
        /*
            Using Comparable interface
         */
        Collections.sort(students);
        for(Student s : students){
            System.out.println(s);
        }

    }
}

class Student implements Comparable<Student>{
    int rollNo;
    int marks;
    public Student(int rollNo,int marks){
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.marks > o.marks ? -1 : this.marks < o.marks ? 1 : 0 ;
    }
}
