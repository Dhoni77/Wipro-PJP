package com.AbstractionPackagesExceptionHandling.ExceptionHandling;

// Write a Program to take care of Number Format
// Exception if user enters values other than integer for calculating average marks of 2 students.
// The name of the students and marks in 3 subjects are taken from the user while executing the program.
//In the same Program write your own Exception classes to take care of Negative values and values out of range
// (i.e. other than in the range of 0-100)

import java.util.Scanner;

class NegativeValueException extends Exception{
    public NegativeValueException(String s){
        super(s);
    }
}
class OutofRangeException extends Exception{
    public OutofRangeException(String s){
        super(s);
    }
}
public class Ex6 {
    public static void main(String[] args) throws NegativeValueException, OutofRangeException{
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<2;i++){
            System.out.println("User name: ");
            int uMarks[]=new int[3];
            int sum=0;
            int avg=0;
            try {
                String user=sc.nextLine();
                System.out.println("Enter the values");
                for (int k=0;k<3;k++){
                    uMarks[k]=sc.nextInt();
                }
                for (int j=0;j<3;j++){
                    int n=uMarks[j];
                    boolean num = n<0;
                    boolean range=n>100?true:false;
                    if(num)
                        throw new NegativeValueException("Please enter a positive integer");
                    else if(range)
                        throw new OutofRangeException("Please enter a integer within range");
                    else {
                        sum+=uMarks[j];
                    }
                }
                avg=sum/3;
                System.out.println("Average is "+avg);
            }
            catch (NegativeValueException e){
                System.out.println(e.getMessage());
            }
            catch (OutofRangeException e){
                System.out.println(e.getMessage());
            }
        }
        sc.close();

    }
}
