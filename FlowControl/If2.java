package com.FlowControl;
//Write a program to check if a given integer number is odd or even.

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
}
