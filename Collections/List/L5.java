package com.Collections.List;

import java.util.LinkedList;

//Implement the assignment 1 using Linked List
public class L5 {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.add("Jan");
        linkedList.add("Feb");
        linkedList.add("Mar");
        linkedList.add("Apr");
        linkedList.add("May");
        linkedList.add("Jun");
        linkedList.add("Jul");
        linkedList.add("Aug");
        linkedList.add("Sep");
        linkedList.add("Oct");
        linkedList.add("Nov");
        linkedList.add("Dec");
        for (String i:linkedList){
            System.out.println(i);
        }
    }
}
