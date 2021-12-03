package com.OOPS.Polymorphism;

//Create  a base class Fruit with name ,taste and size as its attributes.
//
//Create a method called eat() which describes the name of the fruit and its taste.
//
//Inherit the same in 2 other classes Apple and Orange and override the eat() method to represent each fruit taste.
//Inheritance / Overriding

class Fruit{
    String name;
    String taste;
    int size;

    Fruit(String name, String taste, int size){
        this.name=name;
        this.taste=taste;
        this.size=size;
    }

    public String getName() {
        return name;
    }

    public String getTaste() {
        return taste;
    }

    void eat(){
        System.out.println("Fruit: "+this.getName());
        System.out.println("Taste: "+this.getTaste());
    }
}

class Apple extends Fruit{
    Apple(String name, String taste, int size){
        super(name, taste, size);
    }
    @Override
    void eat(){
        System.out.println("Fruit: "+this.getName());
        System.out.println("Taste: "+this.getTaste());
    }
}

class Orange extends Fruit{
    Orange(String name, String taste, int size){
        super(name, taste, size);
    }
    @Override
    void eat(){
        System.out.println("Fruit: "+this.getName());
        System.out.println("Taste: "+this.getTaste());
    }
}
public class Poly1 {
    public static void main(String[] args) {
        Apple apple=new Apple("Apple","Sweet",5);
        apple.eat();
        Orange orange = new Orange("Orange","citric",4);
        orange.eat();
    }
}
