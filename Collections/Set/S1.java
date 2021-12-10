package com.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

// Develop a java class with a instance variable H1 (HashSet)  add a method saveCountryNames(String CountryName) ,
// the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).
//Develop a method getCountry(String CountryName) which iterates through the HashSet and returns the country
// if exist else return null.
//NOTE: You can test the methods using a main method.
public class S1 {
    HashSet<String> H1=new HashSet<>();

    HashSet<String> saveCountryNames(String CountryName){
            H1.add(CountryName);
            return H1;
    }

    String getCountry(String CountryName){
        Iterator iterator= H1.iterator();
        while (iterator.hasNext()){
            String country= (String) iterator.next();
            if (CountryName.equals(country)){
                System.out.println("Country Name "+country+" Found.");
                return country;
            }
        }
        return "Country name not found.";
    }

    public static void main(String[] args) {
            S1 country=new S1();
            country.saveCountryNames("India");
            country.saveCountryNames("Bangladesh");
            country.saveCountryNames("Portugal");

            country.getCountry("India");
    }
}
