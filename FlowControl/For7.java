package com.FlowControl;

//Write a program to print * in Floyds format (using for and while loop)
//*
//*  *
//*  *   *
//
//Example1)
//C:\>java Sample
//O/P: Please enter an integer number
//
//Example2)
//C:\>java Sample 3
//O/P :
//*
//*  *
//*  *  *
public class For7 {
    public static void main(String[] args) {
        int num=3;
        for (int i=1;i<=num;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
