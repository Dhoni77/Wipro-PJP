package com.OOPS.String;

// Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
// otherwise return the string unchanged.
//
//If the input is "xHix", then output is "Hi".
//If the input is "America", then the output is "America".
public class Str7 {
    public static void main(String[] args) {
        String s="xHix";
        int i=0;
        if (s.charAt(i)=='x' || s.charAt(s.length()-1)=='x') System.out.println(s.substring(1,s.length()-1));
        else System.out.println(s);
    }
}
