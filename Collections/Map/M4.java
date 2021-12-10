package com.Collections.Map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Create a Collection “ContactList” using HashMap to store name and phone number of contacts added.
// The program should use appropriate generics (String, Integer) and have the following abilities:
//a) Check if a particular key exists or not.
//b) Check if a particular value exists or not.
//c) Use Iterator to loop through the map.
public class M4 {
    public static void main(String[] args) {
        HashMap<String, Integer> contacts=new HashMap<>();
        contacts.put("Raj",987478347);
        contacts.put("Prem",987478343);
        contacts.put("Rahul",987478344);
        contacts.put("Virat",987478346);
        String key="Rahul";
        boolean iskeyPresent=false;
        int value=987478344;
        boolean isValuePresent=false;
        Iterator i=contacts.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry map=(Map.Entry)i.next();
            String s=(String)map.getKey();
            if(s.equals(key))iskeyPresent=true;
        }
        if (iskeyPresent) System.out.println("key exists");
        else System.out.println("key not found");

        i=contacts.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry map=(Map.Entry)i.next();
            int s=(int) map.getValue();
            if(s==value)
                isValuePresent=true;
        }

        if (isValuePresent) System.out.println("value exists");
        else System.out.println("value not found");
    }
}
