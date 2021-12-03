package com.OOPS.ClassesAndObjects;

//1 Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
// The dimensions of the Box are width, height, depth. The class should have a method that can return
// the volume of the box. Create an object of the Box class and test the functionalities.
//Classes and Objects, Constructor
class Box{
    int width, height, depth;
    Box(int width, int height, int depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }
    int volume(){
        return width*height*depth;
    }
}
public class Class1 {
    public static void main(String[] args) {
        Box b = new Box(3,4,5);
        System.out.println(b.volume());
    }
}
