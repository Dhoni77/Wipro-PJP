package com.Collections.Set;



import java.util.TreeSet;
import java.util.Iterator;

// Develop a java class with a instance variable H1 (TreeSet)  add a method saveCountryNames(String CountryName) ,
// the method should add the passed country to a TreeSet (H1) and return the added TreeSet(H1).
//Develop a method getCountry(String CountryName) which iterates through the TreeSet and returns the country
// if exist else return null.
//NOTE: You can test the methods using a main method.
public class S4 {
    TreeSet<String> H1=new TreeSet<>();

    TreeSet<String> saveCountryNames(String CountryName){
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
        S4 country=new S4();
        country.saveCountryNames("India");
        country.saveCountryNames("Bangladesh");
        country.saveCountryNames("Portugal");

        country.getCountry("India");
    }
}


