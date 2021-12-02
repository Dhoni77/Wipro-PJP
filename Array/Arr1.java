package com.Array;

// Write a program to initialize an integer array and print the sum and average of the array.
//One dimensional Array
public class Arr1 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int avg=0;
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        avg=sum/arr.length;
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+avg);
    }
}
