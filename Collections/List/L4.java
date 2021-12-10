package com.Collections.List;

import java.util.ArrayList;

// Create an ArrayList that can store only numbers like int,float,double,etc, but not any other data type.
public class L4 {
    public static void main(String[] args) {
        ArrayList<Number> arr=new ArrayList<>();
            arr.add(1);
            arr.add(2.9);
//          arr.add('a')//gives error
//          arr.add("apple")//gives error
    }
}
