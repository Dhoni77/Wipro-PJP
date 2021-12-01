package com.FlowControl;

// Write a Java program to find if the given number is prime or not.
//
//Example1)
//C:\>java Sample
//O/P: Please enter an integer number
//
//Example2)
//C:\>java Sample 1
//O/P:1 is neither prime nor composite
//
//Example3)
//C:\>java Sample 0
//O/P: 0 is neither prime nor composite
//
//Example4)
//C:\>java Sample 10
//O/P: 10 is not a prime number
//
//Example5)
//C:\>java Sample 7
//O/P : 7 is a prime number
public class For5 {
    static boolean isPrime(int num){
        for (int i=3;i<=Math.sqrt(num);i+=2){
            if(num%i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num=Integer.parseInt(args[0]);
        if(num <=1) System.out.printf("%d is neither prime nor composite", num);
        if(num==2) System.out.printf("%d is not a prime number", num);
        if(isPrime(num)){
            System.out.printf("%d is a prime number", num);
        }else {
            System.out.printf("%d is not a prime number", num);
        }
    }
}
