package com.OOPS.String;

//Write a Program to check whether a given String is Palindrome or not.
//String/StringBuffer
public class Str1 {
    public static void main(String[] args) {
        String s="madam";
        int i=0,j=s.length()-1;
        boolean palindrome=true;
        while (i < j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else {
                palindrome=false;
                break;
            }
        }
        if(palindrome){
            System.out.println("Palindrome");
        }else System.out.println("Not a palindrome");
    }
}
