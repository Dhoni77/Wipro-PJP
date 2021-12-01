package com.FlowControl;

// Write a Java program to find if the given number is palindrome or not
//
//Example1)
//C:\>java Sample 110011
//O/P: 110011 is a palindrome
//
//Example2)
//C:\>java Sample 1234
//O/P: 1234 is not a palindrome
public class While2 {
    public static void main(String[] args) {
        int num=1212;
        int no=num;
        int rev=0;
        while (num>0){
          int digit=num%10;
          rev = rev * 10 +digit;
          num/=10;
        }
        if(no==rev) System.out.printf("%d is a palindrome",no);
        else System.out.printf("%d is not a palindrome",no);
    }
}
