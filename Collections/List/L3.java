package com.Collections.List;

import java.util.ArrayList;
import java.util.Iterator;

// Create an ArrayList that can store only Strings.
//Create a printAll method that will print all the elements of the ArrayList using an Iterator.
public class L3 {
    static void printAll(ArrayList<String> arr) {
        Iterator iterator = arr.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
    }

    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("One");
        s.add("Two");
        s.add("Three");
        printAll(s);
    }
}
