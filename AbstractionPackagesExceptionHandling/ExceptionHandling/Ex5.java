package com.AbstractionPackagesExceptionHandling.ExceptionHandling;

import java.util.Scanner;

// Write a Program with a division method which receives two integer numbers and performs the division operation.
//
//The method should declare that it throws ArithmeticException. This exception should be handled in the main method.
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int div;
        try{
            div=n1/n2;
            System.out.println(div);
        }
        catch (ArithmeticException a){
            System.out.println(a.getClass().getName());
        }
    }
}
