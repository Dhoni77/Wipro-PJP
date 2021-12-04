package com.OOPS.String;

import java.util.Locale;

// Write a java program that will concatenate 2 strings and return the result. The result should be in lowercase.
//
//Note:If the concatenation creates a double-char, then one of the characters need to be omitted.
//
//Example1)
//i/p:Sachin,Tendulkar
//o/p:sachin tendulkar
//
//Example2)
//i/p:Mark,kate
//o/p:markate
public class Str2 {
    public static void main(String[] args) {
        String s1="Mark";
        String s2="kate";
        String res="";
        if (s1.charAt(s1.length()-1)==s2.charAt(0)){
            s1=s1.substring(0,s1.length()-1);
            res=s1+s2;
            System.out.println(res.toLowerCase());
        }
        else {
            res=s1+" "+s2;
            System.out.println(res.toLowerCase());
        }
    }
}
