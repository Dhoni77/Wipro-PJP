package com.Array;

// Write a program to print the sum of the elements of an array following the given below condition.
//
//If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider
//the other numbers for calculation of sum.
//
//Eg1) Array Elements - 10,3,6,1,2,7,9
//O/P: 22
//[i.e 10+3+9]
//
//Eg2) Array Elements - 7,1,2,3,6
//O/P:19
//
//Eg3) Array Elements - 1,6,4,7,9
//O/P:10
//One dimensional Array
public class Arr8 {
    static int checkForSeven(int seven, int n, int a[]){
        for (int i=seven;i<n;i++){
            if(a[i]==7){
                seven=i+1;
                return seven;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int a[]={1,6,4,7,9};
        int n=5;
        int i=0;
        int sum=0;
        while (i<n){
            if(a[i]==6){
                int idx = checkForSeven(i+1, n, a);
                if(idx<n && idx!=-1){
                    sum+=a[idx];
                    i=idx;
                }
                else if(idx==-1)sum+=a[i];
            }
            else sum+=a[i];
            i++;
        }
        System.out.println(sum);
    }
}
