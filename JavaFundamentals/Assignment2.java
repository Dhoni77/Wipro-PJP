package com.JavaFundamentals;
// Write a Program to accept two integers as command line arguments and print the sum of the two numbers
//
//Example1)
//C:\>java Sample 10 20
//O/P Expected : The sum of 10 and 20 is 30

public class Assignment2 {
    public static void main(String[] args) {
        int num1=Integer.parseInt(args[0]);
        int num2=Integer.parseInt(args[1]);
        System.out.printf("The sum of %d and %d is %d",num1,num2,num1+num2);
    }
}
