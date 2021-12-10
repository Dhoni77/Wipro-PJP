package com.Collections.Set;



// Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.

import java.util.HashSet;
import java.util.Iterator;

class Employee{
    private int empId;
    private String empName;
    private String email;
    private String gender;
    private float salary;

    public Employee(int empId,String empName, String email, String gender, float salary){
        this.empId=empId;
        this.empName=empName;
        this.email=email;
        this.gender=gender;
        this.salary=salary;
    }

    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public float getSalary() {
        return salary;
    }

    void GetEmployeeDetails(){
        System.out.printf("Empid: %d\tEmp Name: %s\tEmail: %s\tGender: %s\tSalary: %.1f",getEmpId(),getEmpName(),getEmail(),getGender(),getSalary());
        System.out.println();
    }
}
public class S2 {
    public static void main(String[] args) {
        HashSet<Employee> employees=new HashSet<>();
        Employee e=new Employee(1234,"Mano","mano@gmail.com","Male",25000);
        Employee e1=new Employee(1111,"Kumar","kumar@email.com","Male",30000);
        employees.add(e);
        employees.add(e1);
        Iterator<Employee> iterator=employees.iterator();
        while (iterator.hasNext()){
            iterator.next().GetEmployeeDetails();
        }
    }
}
