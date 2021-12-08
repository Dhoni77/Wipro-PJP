package com.AbstractionPackagesExceptionHandling.ExceptionHandling;

//Write a program to accept name and age of a person from the command prompt(passed as arguments when you execute the class)
// and ensure that the age entered is >=18 and < 60.
//Display proper error messages.
//
//The program must exit gracefully after displaying the error message in case the arguments passed are not proper.
// (Hint : Create a user defined exception class for handling errors.)

class AgeException extends Exception{
    AgeException(String s){
        super(s);
    }
}
public class Ex8 {
    public static void main(String[] args) throws AgeException{
        String name =args[0];
        try {
            int age=Integer.parseInt(args[1]);
            if(age>=18 && age<60) System.out.println("Age is valid");
            else throw new AgeException("Age is not valid, Age must be between 18 and 60");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
