package com.AbstractionPackagesExceptionHandling.Abstraction;

//
// Create a class called GeneralBank that acts as base class for all banks.
// This class has getSavingsInterestRate and getFixedDepositInterestRate methods,
// which returns the savings account interest rate and fixed deposit account interest
//  rate that the specific bank gives. Since GeneralBank cannot say what percentage which bank would give,
//   make these methods abstract.
//
//Create two subclasses of GeneralBank called ICICIBank and KotMBank. Override the inherited methods from the base class.
// The following are the interest rates of these banks.
//ICICIBank - Savings 4% Fixed 8.5% and
//KotMBank - Savings 6% Fixed 9%.
//
//Create a main method to test the above classes and their methods. Try one by one and observe your findings
//
//a) ICICIBank i=new ICICIBank();
//
//b) KotMBank k=new KotMBank();
//
//c) GeneralBank g=new KotMBank();
//
//d) GeneralBank g=new ICICIBank();
abstract class GeneralBank{
    abstract double getSavingsRate();
    abstract double getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank{
    @Override
    double getSavingsRate(){
        return 0.04;
    }
    @Override
    double getFixedDepositInterestRate(){
        return 0.085;
    }
}

class KotMBank extends GeneralBank{
    @Override
    double getSavingsRate(){
        return 0.06;
    }
    @Override
    double getFixedDepositInterestRate(){
        return 0.09;
    }
}
public class Abs1 {
    public static void main(String[] args) {
        ICICIBank i=new ICICIBank();
        System.out.println(i.getFixedDepositInterestRate());
        KotMBank k=new KotMBank();
        System.out.println(k.getFixedDepositInterestRate());
        GeneralBank g=new KotMBank();
        System.out.println(g.getFixedDepositInterestRate());
        GeneralBank g2=new ICICIBank();
        System.out.println(g2.getFixedDepositInterestRate());
    }
}
