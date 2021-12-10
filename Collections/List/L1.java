package com.Collections.List;

import java.util.ArrayList;

// Write a Java program to create an ArrayList, add all the months of a year and print the same.
public class L1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Jan");
        arrayList.add("Feb");
        arrayList.add("Mar");
        arrayList.add("Apr");
        arrayList.add("May");
        arrayList.add("Jun");
        arrayList.add("Jul");
        arrayList.add("Aug");
        arrayList.add("Sep");
        arrayList.add("Oct");
        arrayList.add("Nov");
        arrayList.add("Dec");
        for (String i:arrayList){
            System.out.println(i);
        }
    }
}
