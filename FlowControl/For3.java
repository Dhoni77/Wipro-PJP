package com.FlowControl;

import java.util.Scanner;

// Write a program to check if a given number is prime or not.
public class For3 {
    static boolean isPrime(int num){
        if(num <=1) return false;
        if(num==2) return true;
        for (int i=3;i<=Math.sqrt(num);i+=2){
            if(num%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(isPrime(num))
            System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}
