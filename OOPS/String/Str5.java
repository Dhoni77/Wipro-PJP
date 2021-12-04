package com.OOPS.String;

// Write a java program that accepts a string and returns a new string without the first and last character of the input string.
//
//Example1)
//i/p:Suman
//o/p:uma
public class Str5 {
    public static void main(String[] args) {
        String s ="Suman";
        System.out.println(s.substring(1,s.length()-1));
    }
}
