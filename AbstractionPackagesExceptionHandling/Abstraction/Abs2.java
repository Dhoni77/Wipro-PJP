package com.AbstractionPackagesExceptionHandling.Abstraction;

// Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in this class.
//
//public abstract String notice();
//
//Derive FirstClass, Ladies, General, Luggage classes from the compartment class.
// Override the notice function in each of them to print notice message that is suitable to the specific type of  compartment.
//
//Create a class TestCompartment.Write main function to do the following:
//Declare an array of Compartment of size 10.
//Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
//Check the polymorphic behavior of the notice method.
//[i.e based on the random  number genererated, the first compartment can be Luggage,
// the second one could be Ladies and so on..]

import java.util.Random;

abstract class Compartment{
   public abstract String notice();
}

class FirstClass extends Compartment{
    @Override
    public String notice(){
        return "First Class";
    }
}

class Ladies extends Compartment{
    @Override
    public String notice(){
        return "Ladies";
    }
}

class General extends Compartment{
    @Override
    public String notice(){
        return "General";
    }
}

class Luggage extends Compartment{
    @Override
    public String notice(){
        return "Luggage";
    }
}

class TestCompartment{
    public static void main(String[] args) {
        int compartement[]=new int[10];
    }
}
public class Abs2 {
    public static void main(String[] args) {
        Compartment cmp[]=new Compartment[10];
        Random random=new Random();
        int num;
        for (int i=0;i<cmp.length;i++){
            num=random.nextInt(4)+1;
            switch (num){
                case 1:
                    cmp[i]=new FirstClass();
                    break;
                case 2:
                    cmp[i]=new Ladies();
                    break;
                case 3:
                    cmp[i]=new General();
                    break;
                case 4:
                    cmp[i]=new Luggage();
                    break;
            }
            System.out.println(cmp[i].notice());
        }
    }
}
