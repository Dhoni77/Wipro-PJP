package com.AbstractionPackagesExceptionHandling.ExceptionHandling;

// Write a class MathOperation which accepts 5 integers through command line. Create an array using these parameters.
// Loop through the array and obtain the sum and average of all the elements and display the result.
//
//Various exceptions that may arise like ArithmeticException, NumberFormatException, and so on should be handled.

class MathOperation{
    public static void main(String[] args) {
        int arr[]=new int[5];
        int sum=0;
        int average=0;
        try {
            for (int i=0;i<arr.length;i++){
                arr[i]=Integer.parseInt(args[i]);
                sum+=arr[i];
            }
            average=sum/5;
            System.out.println("Sum is "+sum);
            System.out.println("Average is "+average);
        }
        catch (ArithmeticException e){
            System.out.println(e.getClass().getName());
        }
        catch (NumberFormatException e){
            System.out.println(e.getClass().getName());
        }
    }
}
public class Ex4 {
    public static void main(String[] args) {

    }
}
