package com.FlowControl;

import java.util.Scanner;

//Write a program to check if a given integer number is Positive, Negative, or Zero.
public class If1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(num<0){
            System.out.println("Negative");
        }
        else if(num>0){
            System.out.println("Positive");
        }
        else {
            System.out.println("Zero");
        }
    }
}
