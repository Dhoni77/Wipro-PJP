package com.Array;

// Write a program to initialize an array and print them in a sorted order.
//One dimensional Array
public class Arr6 {
    public static void main(String[] args) {
        int arr[]={1,5,6,8,9};
        int n=5;
        //sort
        for (int i=0;i<n;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j]=temp;
                }
            }
        }

        //print
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
