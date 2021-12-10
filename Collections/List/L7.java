package com.Collections.List;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

// Write a program that will have a Vector which is capable of storing Employee objects.
// Use an Iterator and enumeration to list all the elements of the Vector.
public class L7 {
    public static void main(String[] args) {
        Employee e=new Employee(1234,"Mano","mano@gmail.com","Male",25000);
        Employee e1=new Employee(1111,"Kumar","kumar@email.com","Male",30000);
        Vector<Employee> emp=new Vector<>();
        emp.add(e);
        emp.add(e1);
        System.out.println("Using Iterator");
        Iterator<Employee> iterator= emp.iterator();
        while (iterator.hasNext())
            iterator.next().GetEmployeeDetails();

        System.out.println("Using Enumeration:");
        Enumeration<Employee> en = emp.elements();
        while (en.hasMoreElements())
            en.nextElement().GetEmployeeDetails();
    }
}
