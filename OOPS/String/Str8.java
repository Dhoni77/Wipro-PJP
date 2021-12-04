package com.OOPS.String;

// Write a Java program that accepts a string (with * in it). The program should return a new
// string in which the following characters are removed-*,the characters that are to the left and right of *
//
//Example1)
//i/p:ab*cd
//o/p:ad
public class Str8 {
    public static void main(String[] args) {
        String s="ab*cd";
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                if(i==0) {
                    System.out.println(s.substring(i+2,s.length()));
                    break;
                }
                else if(i==s.length()-1) {
                    System.out.println(s.substring(0, s.length()-2));
                    break;
                }
                else System.out.println(s.substring(0,i-1)+s.substring(i+2,s.length()));
            }
        }
    }
}
