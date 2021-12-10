package com.Collections.List;

// 1) Create an application for employee management with the following classes:
//
//a) Create an Employee class with following attributes and behaviors :
//i) int empId
//ii)String empName
//iii)String email
//iv)String gender
//v)float salary
//vi) void GetEmployeeDetails() -> prints employee details
//


import java.util.ArrayList;
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

////b) Create one more class EmployeeDB with the following attributes and behaviors.
////(i)ArrayList list;
////ii) boolean addEmployee(Employee e)  -> adds the employee object to the collection
////iii) boolean deleteEmployee(int empId)  ->delete the employee object from the collection with the given empid
////iv) String showPaySlip(int empId)  -> returns the payslip of the employee with the given empId
////
////Provide implementation for all the methods and test your program.

class EmployeeDB {
    ArrayList<Employee> employees=new ArrayList<>();

    boolean addEmployee(Employee e){
        System.out.println("Employee "+e.getEmpName()+" added.");
        employees.add(e);
        return true;
    }

    boolean deleteEmployee(int empId){
        if(employees.size()==0){
            System.out.println("Employees list empty");
            return false;
        }
        String name="";
       for(int i=0;i<employees.size();i++){
           if(employees.get(i).getEmpId() == empId){
               name=employees.get(i).getEmpName();
               employees.remove(i);
           }
       }
        System.out.printf("Employee: %s Id: %d removed",name,empId);
        System.out.println();
       return true;
    }

    String showPaySlip(int empId){
        int index=0;
        if(employees.size()==0){
            return "Employees list empty";
        }

        for(int i=0;i<employees.size();i++){
            if(employees.get(i).getEmpId() == empId){
                index=i;
            }
        }

        String s=""+employees.get(index).getSalary();;
        return s;
    }
}
public class L2 {
    public static void main(String[] args) {
        Employee e=new Employee(1234,"Mano","mano@gmail.com","Male",25000);
        e.GetEmployeeDetails();
        EmployeeDB edb=new EmployeeDB();
        edb.addEmployee(e);
        edb.deleteEmployee(1234);
        System.out.println(edb.showPaySlip(1234));
    }
}
