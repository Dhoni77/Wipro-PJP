package com.Array;

// Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.
//
//Example1)
//C:\>java Sample 1 2 3
//O/P: Please enter 4 integer numbers
//
//Example2)
//C:\>java Sample 1 2 3 4
//O/P:
// The given array is :
//  1 2
//  3 4
// The reverse of the array is :
//  4 3
//  2 1
//Two Dimensional Array
public class Arr9 {
    public static void main(String[] args) {
        int a[] = new int[4];
        if (args.length == 4) {
            for (int i = 0; i < args.length; i++) {
                a[i] = Integer.parseInt(args[i]);
            }
            int arr[][] = new int[2][2];
            int rev[][] = new int[2][2];

            int n = 4;
            int count = 0;
            System.out.println("The given array is");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = a[count++];
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("The reversed array is");
            for (int i = 0, m = 1; i < 2; i++, m--) {
                for (int j = 0, k = 1; j < 2; j++, k--) {
                    rev[i][j] = arr[m][k];
                    System.out.print(rev[i][j] + "\t");
                }
                System.out.println();
            }
        } else System.out.println("Please enter 4 integer numbers");
    }
}
