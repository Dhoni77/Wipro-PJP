package com.Array;

// Initialize an integer array with ascii values and print the corresponding character values in a single row.
//One dimensional Array
public class Arr4 {
    public static void main(String[] args) {
        int arr[]={65,66,67,68,69,70};
        for (int i=0;i<arr.length;i++){
            System.out.print((char) arr[i]+"\t");
        }
    }
}
