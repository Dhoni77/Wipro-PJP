package com.FlowControl;

// Write a program to print the sum of all the digits of a given number.
//
//Example1)
//I/P:1234
//O/P:10
public class For6 {
    public static void main(String[] args) {
        int num=1234;
        int rem=0;
        int sum=0;
        while (num>0){
            rem=num%10;
            num/=10;
            sum+=rem;
        }
        System.out.println(sum);
    }
}
