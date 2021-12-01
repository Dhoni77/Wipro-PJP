package com.FlowControl;

//Write a program to reverse a given number and print
//
//Example1)
//I/P: 1234
//O/P:4321
//
//Example2)
//I/P:1004
//O/P:4001
public class While1 {
    public static void main(String[] args) {
        int num=1004;
        int rem=0;
        while (num>0){
            rem=num%10;
            num/=10;
            System.out.print(rem);
        }
    }
}
