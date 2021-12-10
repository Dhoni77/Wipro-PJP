package com.Collections.List;

import java.util.Vector;

// Implement the assignment 1 using Vector
public class L6 {
    public static void main(String[] args) {
        Vector<String> vector=new Vector<>();
        vector.add("Jan");
        vector.add("Feb");
        vector.add("Mar");
        vector.add("Apr");
        vector.add("May");
        vector.add("Jun");
        vector.add("Jul");
        vector.add("Aug");
        vector.add("Sep");
        vector.add("Oct");
        vector.add("Nov");
        vector.add("Dec");
        for (String i:vector){
            System.out.println(i);
        }
    }
}
