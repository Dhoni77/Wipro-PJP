package com.OOPS.String;

// Write a java program that will return the first half of the string, if the length of the string is even.
// It should return null for odd length string.
//
//Example1)
//i/p:TomCat
//o/p:Tom
//
//Example2)
//i/p:Apron
//o/p:null
public class Str4 {
    public static void main(String[] args) {
        String s = "TomCat";
        if(s.length() % 2 == 0) System.out.println(s.substring(0,s.length()/2));
        else System.out.println("null");
    }
}
