package com.Project1;

class Employee{
  void displayDetails(String[][] emp, String empid) {
      int row = 0;
      boolean isPresent = false;
      for (int i = 0; i < 5; i++) {
          if (emp[i][0].equals(empid)) {
              row = i;
              isPresent = true;
          }
      }
      if (isPresent) {
          int DA = 0;
          String designation = "";
          String dCode = emp[row][3];
          switch (dCode) {
              case "e":
                  designation = "Engineer";
                  DA = 20000;
                  break;
              case "c":
                  designation = "Consultant";
                  DA = 32000;
                  break;
              case "k":
                  designation = "Clerk";
                  DA = 12000;
                  break;
              case "r":
                  designation = "Receptionist";
                  DA = 15000;
                  break;
              case "m":
                  designation = "Manager";
                  DA = 40000;
                  break;
          }
          int salary = Integer.parseInt(emp[row][5]) + Integer.parseInt(emp[row][6]) + DA - Integer.parseInt(emp[row][7]);
          System.out.println("Emp No. Emp Name Department Designation Salary");
          System.out.println(emp[row][0] + "    " + emp[row][1] + "      " + emp[row][4] + "        " + designation + "    " + salary);
      }
      else System.out.println("There is no employee with empid : "+empid);
  }

}
public class Project1 {
    public static void main(String[] args) {
        String empid=args[0];
        String[][] emp={
                {"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
                {"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
                {"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
                {"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
                {"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"}
        };
        Employee employee=new Employee();
        employee.displayDetails(emp, empid);
    }
}
