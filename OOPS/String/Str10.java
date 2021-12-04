package com.OOPS.String;

// Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.
//You may assume that n is between 0 and the length of the string, inclusive.
//
//Example1)
//i/p:Wipro,3
//o/p:propropro
public class Str10 {
    public static void main(String[] args) {
        int n=3;
        String s="Wipro";
        for (int i=0;i<3;i++)
            System.out.print(s.substring(s.length()-n,s.length()));
    }
}
