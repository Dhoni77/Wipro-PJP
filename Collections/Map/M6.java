package com.Collections.Map;

// Implement the assignment 1 using HashTable

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

// 1. Develop a java class with a instance variable M6 (Hashtable)  create a method
// saveCountryCapital(String CountryName, String capital) , the method should add the passed country and
// capital as key/value in the map M6 and return the Map (M6).
//Key- Country                          Value - Capital
//India                                                   Delhi
//Japan                                                Tokyo
//2. Develop a method getCapital(String CountryName) which returns the capital for the country passed, from the
// Map M6 created in step 1.
//3. Develop a method getCountry(String capitalName) which returns the country for the capital name,
// passed from the Map M6 created in step 1.
//4. Develop a method which iterates through the map M6 and creates another map M2 with Capital as the key and value
// as Country and returns the Map M2.
//Key – Capital                    Value – Country
//Delhi                                           India
//Tokyo                                        Japan
//5. Develop a method which iterates through the map M6 and creates an ArrayList with all the Country names stored as keys.
// This method should return the ArrayList.
//NOTE: You can test the methods using a main method.
public class M6 {
    Hashtable<String,String> M6=new Hashtable<>();

    Hashtable<String,String> saveCountryCapital(String CountryName, String Capital){
        M6.put(CountryName,Capital);
        return M6;
    }

    String getCapital(String CountryName){
        Iterator i=M6.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry map=(Map.Entry)i.next();
            if(map.getKey().equals(CountryName))return (String) map.getValue();
        }
        return "Capital Not Found";
    }

    String getCountry(String capitalName){
        Iterator i=M6.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry map=(Map.Entry)i.next();
            if(map.getValue().equals(capitalName))return (String) map.getKey();
        }
        return "Country not found.";
    }

    Hashtable<String,String> createNewMap(Hashtable<String,String> map1){
        Iterator iterator=map1.entrySet().iterator();
        Hashtable<String ,String> map2=new Hashtable<>();
        while (iterator.hasNext()){
            Map.Entry M6=(Map.Entry) iterator.next();
            map2.put((String) M6.getValue(),(String)M6.getKey());
        }
        return map2;
    }

    //5. Develop a method which iterates through the map M6 and creates an ArrayList with all the Country names stored as keys.
// This method should return the ArrayList.

    ArrayList<String> createArrayList(Hashtable<String,String> map1){
        ArrayList<String> countryNames=new ArrayList<>();
        Iterator iterator=map1.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry map=(Map.Entry) iterator.next();
            countryNames.add((String) map.getKey());
        }
        return countryNames;
    }
    public static void main(String[] args) {
        M6 map=new M6();
        map.saveCountryCapital("India","Delhi");
        map.saveCountryCapital("Afghanistan","Kabul");
        map.saveCountryCapital("China","Beijing");
        map.saveCountryCapital("Japan","Tokyo");
        map.saveCountryCapital("Italy","Rome");
        System.out.println("For Country Italy Capital is: ");
        System.out.println(map.getCapital("Italy"));
        System.out.println("For Capital Delhi Country is: ");
        System.out.println(map.getCountry("Delhi"));
        Iterator iterator=map.createNewMap(map.M6).entrySet().iterator();
        System.out.println("New Map is ");
        System.out.println("Key:Capital     Value:Country");
        while (iterator.hasNext()){
            Map.Entry m=(Map.Entry)iterator.next();
            System.out.println(m.getKey()+"            "+m.getValue());
        }
        System.out.println();
        System.out.println("ArrayList");
        ArrayList<String> arr=new ArrayList<>();
        arr=map.createArrayList(map.M6);
        iterator=arr.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        System.out.println();
    }
}


