package com.AbstractionPackagesExceptionHandling.ExceptionHandling;

import java.util.Scanner;

// Write a program that accepts 2 integers a and b as input and finds the quotient of a/b.
//
//This program may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception.
//
//In the catch block, print the message as shown in the sample output.
//Also illustrate the use of finally block. Print the message “Inside finally block”.
//
//Example1)
//Enter the 2 numbers
//5
//2
//The quotient of 5/2 = 2
//Inside finally block
//
//Example2)
//Enter the 2 numbers
//5
//DivideByZeroException caught
//Inside finally block
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int div;
        try{
            div=n1/n2;
        }
        catch (Exception e){
            System.out.println(e.getMessage()+" caught");
        }
        finally {
            System.out.println("Inside finally block");
        }
    }
}
