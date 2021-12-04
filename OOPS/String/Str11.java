package com.OOPS.String;

import java.util.ArrayList;

// Given two strings a and b, return a new string, following the rules given below.
//If string b occurs in string a, then the new string should concatenate the characters
//that appear before and after of String b.
//Ignore cases where there is no character before or after the word, and a character may be
// included twice if it is in between two string b's.
//
//Example1)
//i/p:abcXY123XYijk,XY
//o/p:c13i
//
//Example2)
//i/p:XY123XY,XY
//o/p:13
//
//Example3)
//i/p:XY1XY,XY
//o/p:11
public class Str11 {
    public static void main(String[] args) {
        String str1 = "XY1XY";
        String str2 = "XY";
        int len = str2.length();
        StringBuffer sbr = new StringBuffer();

        int leftIndex = str1.indexOf(str2);
        if (leftIndex != 0)
            sbr.append(str1.charAt(leftIndex -1));
        if (leftIndex + len < str1.length())
            sbr.append(str1.charAt(leftIndex + len));

        int rightIndex = str1.lastIndexOf(str2);
        if (rightIndex != 0)
            sbr.append(str1.charAt(rightIndex -1));
        if (rightIndex + len < str1.length())
            sbr.append(str1.charAt(rightIndex + len));

        System.out.println(sbr);
    }
}
