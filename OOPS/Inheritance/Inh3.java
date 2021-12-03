package com.OOPS.Inheritance;

// Create a school application with a class called Person. Create name and dateOfBirth as member variables.
//
//Create a class called Teacher that inherits from the Person class.
// The teacher will have additional properties like salary, and the subject that the teacher teaches.
//
//Create a class called Student that inherits from Person class. This class will have a member variable called studentId.
//
//Create a class called College Student that inherits from Student class.
// This class will have collegeName, the year in which the student is studying (first/second/third/fourth) etc.
//
//Create objects of each of this classes, invoke and test the methods that are available in these classes.

 class Person{
     String name;
     String dateOfBirth;
     Person(String name, String dateOfBirth){
         this.name=name;
         this.dateOfBirth=dateOfBirth;
     }

     public String getName() {
         return name;
     }

     public String getDateOfBirth() {
         return dateOfBirth;
     }

     void printDetails(){
         System.out.println("Person Details");
         System.out.printf("Name: %s\tDOB: %s",this.getName(),this.getDateOfBirth());
         System.out.println();
     }
 }
class Teacher extends Person{
    int salary;
    String subject;
    Teacher(String teacherName,String dateofBirth,int salary, String subject){
        super(teacherName, dateofBirth);
        this.salary=salary;
        this.subject=subject;
    }

    public int getSalary() {
        return salary;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    void printDetails(){
        System.out.println("Teacher Details");
        System.out.printf("Name: %s\tDOB: %s\tSalary: %d\tSubject: %s",this.getName(),this.getDateOfBirth(),this.getSalary(),this.subject);
        System.out.println();
    }
}
class Student extends Person{
     int studentId;
     Student(String studentName, String dateofBirth, int studentId){
         super(studentName, dateofBirth);
         this.studentId=studentId;
     }

    public int getStudentId() {
        return studentId;
    }

    @Override
    void printDetails(){
        System.out.println("Student Details");
        System.out.printf("Name: %s\tDOB: %s\tStudentId: %d",this.getName(),this.getDateOfBirth(),this.getStudentId());
        System.out.println();
    }
}

class CollegeStudent extends Student{
     String clgName;
     String year;
     CollegeStudent(String studentName, String dateofBirth,int studentId,String clgName, String year){
         super(studentName,dateofBirth,studentId);
         this.clgName=clgName;
         this.year=year;
     }

    public String getClgName() {
        return clgName;
    }

    public String getYear() {
        return year;
    }
    @Override
    void printDetails(){
        System.out.println("Student Details");
        System.out.printf("Name: %s\tDOB: %s\tStudentId: %d\tCollege Name: %s\tYear: %s",this.getName(),this.getDateOfBirth(),this.getStudentId(),this.getClgName(),this.getYear());
        System.out.println();
     }
}

class TestSchool{
    public static void main(String[] args) {
        Person p = new Person("Ram", "01/01/1988");
        Teacher t=new Teacher("Mano","22/07/1978", 25000,"Maths");
        Student s= new Student("Kumar","12/10/1998",1712);
        CollegeStudent c = new CollegeStudent("Ajay","01/09/1997",88888,"IIT Delhi","First");
        p.printDetails();
        t.printDetails();
        s.printDetails();
        c.printDetails();
    }
}
public class Inh3 {
}
