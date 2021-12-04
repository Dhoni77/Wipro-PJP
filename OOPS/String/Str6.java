package com.OOPS.String;

// Given 2 strings, a and b, return a new string of the form short+long+short,
// with the shorter string on the outside and the longer string on the inside.
//
//The strings will not be the same length, but they may be empty (length 0).
//
//If input is "hi" and "hello", then output will be "hihellohi".
public class Str6 {
    public static void main(String[] args) {
        String s1="hi";
        String s2="hello";
        if (s1.length() < s2.length()){
            System.out.println(s1+s2+s1);
        }
        else System.out.println(s2+s1+s2);
    }
}
