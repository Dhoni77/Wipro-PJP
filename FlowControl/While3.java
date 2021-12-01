package com.FlowControl;

// Write a program to print first 5 values which are divisible by 2, 3, and 5.
public class While3 {
    public static void main(String[] args) {
        int num=200;
        int i=1;
        int count=0;
        while(i<num){
            if(i % 30 ==0){
                System.out.println(i);
                count++;
            }
            if (count==5)break;
            i++;
        }
    }
}
