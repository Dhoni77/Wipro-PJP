package com.Collections.Map;

import java.util.*;
// Write a program that will have a Properties class object which is capable of storing some States of India and their Capital.
// Use an Iterator to list all the elements stored in the Properties.

public class M3 {
    public static void main(String[] args) {
            Properties props=new Properties();
            props.setProperty("Tamil Nadu","Chennai");
            props.setProperty("Kerala","Trivandrum");
            props.setProperty("Uttarpradesh","Noida");

            Iterator iterator=props.entrySet().iterator();
            System.out.println("States and Capital");
            while (iterator.hasNext()){
                Map.Entry map=(Map.Entry) iterator.next();
                System.out.println(map.getKey()+" : "+map.getValue());
            }
    }
}
