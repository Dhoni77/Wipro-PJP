package com.Collections.Project;

import java.util.*;

class Employee{
    private String firstName;
    private String lastName;
    private long mobileNo;
    private String email;
    private String address;

    Employee(String firstName,String lastName, long mobileNo,String email,String address){
        this.firstName=firstName;
        this.lastName=lastName;
        this.mobileNo=mobileNo;
        this.email=email;
        this.address=address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getMobileNo() {
        return mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    void getEmployeeDetails(){
        System.out.format("%-15s %-15s %-12s %-30s %-15s\n",getFirstName(),getLastName(),getMobileNo(),getEmail(),getAddress());
    }
}



class TestEmployee{
    public static Comparator<Employee> byName() {
        return new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getFirstName().compareToIgnoreCase(o2.getFirstName());
            }
        };
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of employees");
        int empCount=scanner.nextInt();
        scanner.nextLine();
       ArrayList<Employee> emp=new ArrayList<>();
        for (int i=1;i<=empCount;i++){
            System.out.println("Enter Employee "+i+" Details");
            System.out.println("Enter the first name");
            String firstName= scanner.next();
            System.out.println("Enter the last name");
            String lastName=scanner.next();
            System.out.println("Enter the mobile number");
            long mobileNo=scanner.nextLong();
            System.out.println("Enter the email");
            String email=scanner.next();
            System.out.println("Enter the address");
            String address=scanner.next();
            emp.add(new Employee(firstName, lastName, mobileNo, email, address));
        }

        Collections.sort(emp, byName());
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
        for (int i = 0; i < 90; i++) System.out.print("-");
        System.out.println();
        Iterator iterator=emp.iterator();
        while (iterator.hasNext()){
            Employee e= (Employee) iterator.next();
            e.getEmployeeDetails();
        }
    }


}
public class Prj1 {

}
