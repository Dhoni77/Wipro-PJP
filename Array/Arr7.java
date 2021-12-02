package com.Array;

// Write a program to remove the duplicate elements in an array and print the same.
//Example)
//I/P:{12,34,12,45,67,89}
//O/P:{12,34,45,67,89}
//One dimensional Array
public class Arr7 {
    public static void main(String[] args) {
        int max=0;
        int high=0;
        int arr[]={12,34,12,45,67,89};
        int n=arr.length;
        int hash[];
        //find max element
        for (int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //initialize hash array
        hash=new int[max+1];

        for (int i=0;i<n;i++){
            hash[arr[i]]++;
        }

        for (int i=0;i<hash.length;i++){
            if(hash[i]>=1) System.out.println(i);
        }
    }
}
