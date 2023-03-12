package com.learning.CollectionGenerics;

//Only works with classes not wrapper classes
class Container<T extends Number>{
    T value ;

    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    public void show(){
        System.out.println(value.getClass().getName());
    }
}

public class GenericExample {

    public static void main(String[] args) {
        //Container<Integer> myContainer = new Container<>();
        Container<Double> myContainer = new Container<>();
        myContainer.setValue(10d);
        myContainer.show();
    }

}
