package com.FlowControl;

// Initialize a character variable with an alphabhet in a program.
//
//If the character value is in lowercase, the output should be displayed in uppercase in the following format.
//
//Example1)
//i/p:a
//o/p:a->A
//
//If the character value is in uppercase, the output should be displayed in lowercase in the following format.
//
//Example2)
//i/p:A
//o/p:A->a
public class If7 {
    public static void main(String[] args) {
        char c='A';
        if(c >=65 && c<=90) System.out.println((char)(c+32));
        else System.out.println((char) (c-32));
    }
}
