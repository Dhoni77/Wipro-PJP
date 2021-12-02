package com.Array;

// Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
//One dimensional Array
public class Arr5 {
    public static void main(String[] args) {
        int arr[]={15,5,20,55,3};
        int n=5;
        //sort the array
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //first  and second min element
        System.out.printf("Min element First %d Second %d",arr[0],arr[1]);
        System.out.println();
        //first  and second max element
        System.out.printf("Max element First %d Second %d",arr[n-1],arr[n-2]);
    }
}
