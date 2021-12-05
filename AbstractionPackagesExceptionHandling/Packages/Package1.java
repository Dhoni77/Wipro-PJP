package com.AbstractionPackagesExceptionHandling.Packages;

//Create a package called test package.
//Define a class called foundation inside the test package.
//Inside the class, you need to define 4 integer variables:
//var1 with private access modifier
//var2 with default access modifier
//var3 with protected access modifier
//var4 with public access modifier
//
//Import this class and packages in another class.
//Try to access all 4 variables of the foundation class and see what variables are accessible and what are not accessible.

import com.AbstractionPackagesExceptionHandling.Packages.TestPackage.Foundation;
public class Package1{
    public static void main(String[] args) {
        Foundation foundation=new Foundation();
        foundation.var4=1; //only public member is accessible.
    }
}

