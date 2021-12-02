package com.Array;

// Write a program to find the biggest number in a 3*3 array.
// The program is supposed to receive 9 integer numbers as command line arguments.
//
//
//Example1:
//C:\>java Sample 1 2 3
//O/P: Please enter 9 integer numbers
//
//Example2:
//C:\>java Sample 1 23 45 55 121 222 56 77 89
//O/P:
//The given array is :
//1 23 45
//55 121 222
//56 77 89
//The biggest number in the given array is 222
//Two Dimensional Array
public class Arr10 {
    public static void main(String[] args) {
        if (args.length == 9) {
            int a[] = new int[9];
            int count = 0;
            int max = 0;
            int arr[][][] = new int[3][3][3];
            int n = 3;
            //initialize 1d array
            for (int i = 0; i < args.length; i++) {
                a[i] = Integer.parseInt(args[i]);
            }
            //copy elements to 3d array
            for (int i = 0; i < n - 2; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        if (a[count] > max && count < 9) max = a[count];
                        arr[i][j][k] = a[count++];
                    }
                }
            }
            //print array
            System.out.println("The given array is");
            for (int i = 0; i < n - 2; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        System.out.print(arr[i][j][k] + "\t");
                    }
                    System.out.println();
                }
            }
            System.out.println("The biggest element in the array is " + max);
        }
        else System.out.println("Please enter 9 integer numbers");
    }
}
