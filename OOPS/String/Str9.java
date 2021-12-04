package com.OOPS.String;

// Given two strings, a and b, print a new string which is made of the following combination-first
// character of a, the first character of b, second character of a, second character of b and so on.
//Any characters left, will go to the end of the result.
//
//Example1)
//i/p:Hello,World
//o/p:HWeolrllod
public class Str9 {
    public static void main(String[] args) {
        String a="Hello";
        String b="World";
        char c[]=new char[a.length()+b.length()];
        int j=0,k=0;
        for (int i=0;i<a.length()+b.length();i++){
            if(i%2==0){
                c[i]=a.charAt(j++);
            }
            else  c[i]=b.charAt(k++);
        }
        for (char ch:c){
            System.out.print(ch+"");
        }
    }
}
