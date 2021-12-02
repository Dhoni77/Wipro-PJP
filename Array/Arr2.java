package com.Array;

// Write a program to initialize an integer array and find the maximum and minimum value of the array.
//One dimensional Array
public class Arr2 {
    public static void main(String[] args) {
        int arr[]={3,10,4,2,5};
        int n=5;
        int min=arr[0],max=arr[0];
        for (int i=0;i<n;i++){
            if(arr[i]>max)max=arr[i];
            else if(arr[i]<min)min=arr[i];
        }
        System.out.println("Min is "+min);
        System.out.println("Max is "+max);
    }
}
