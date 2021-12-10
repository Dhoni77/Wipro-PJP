package com.Collections.Set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

// Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :
//a) Reverse the elements of the Collection.
//b) Iterate the elements of the TreeSet using Iterator.
//c) Check if a particular element exists or not.
public class S3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<String>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        treeSet.add("D");
        treeSet.add("E");
        NavigableSet<String> reverse = treeSet.descendingSet();
        Iterator<String> iterator=reverse.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


        String toFind="E";
        iterator=treeSet.iterator();
        while (iterator.hasNext()){
            String s=iterator.next();
            if(toFind.equals(s)){
                System.out.println("Found "+s);
                break;
            }
        }

    }
}
