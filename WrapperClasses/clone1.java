package com.WrapperClasses;

// Create an employee class with properties of your choice. Create an object of this class and
// also create a clone of the same. After making the clone, change the properties of the original employee object and
// print the properties of both the original and clone object and note down your observation.

class Employee implements Cloneable{
    String name;
    int id;
    Employee(String name , int id){
        this.name=name;
        this.id=id;
    }
    Employee Clone(){
        try {
            return (Employee) super.clone();
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return this;
        }
    }
}

public class clone1  {
    public static void main(String[] args) {
        Employee emp=new Employee("Kamal",1);
        Employee emp2=emp.Clone();
        emp.name="Raj";
        System.out.println("Name: "+emp.name);
        System.out.println("Name: "+emp2.name);
        if(emp!=emp2) System.out.println("not equal");
    }
}