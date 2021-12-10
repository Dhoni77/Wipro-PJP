package com.Collections.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


// Create a Collection called HashMap which is capable of storing String objects. The program should have the following abilities
//a) Check if a particular key exists or not.
//b) Check if a particular value exists or not.
//c) Use Iterator to loop through the map.
public class M2 {
    public static void main(String[] args) {
        HashMap<String,String> hm=new HashMap<>();
        hm.put("A","Apple");
        hm.put("B","Ball");
        hm.put("C","Cat");
        String key="D";
        boolean iskeyPresent=false;
        String value="apple";
        boolean isValuePresent=false;
        Iterator i=hm.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry map=(Map.Entry)i.next();
            String s=(String) map.getKey();
            if(s.equals(key))
                iskeyPresent=true;
        }
       if (iskeyPresent) System.out.println("key exists");
       else System.out.println("key not found");
        i=hm.entrySet().iterator();
        while (i.hasNext()){
            Map.Entry map=(Map.Entry)i.next();
            String s=(String) map.getValue();
            if(s.equals(value))
                isValuePresent=true;
        }

        if (isValuePresent) System.out.println("value exists");
        else System.out.println("value not found");


        i=hm.entrySet().iterator();
        while (i.hasNext())
        {
            Map.Entry map=(Map.Entry)i.next();
            System.out.println("key "+(String) map.getKey()+"   "+"value "+(String) map.getValue());
        }
    }
}
