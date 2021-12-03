package com.OOPS.ClassesAndObjects;

// Design a class that can be used by a health care professional to keep track of a patient’s vital statistics.
// The following are the details.
//Name of the class - Patient
//Member Variables - patientName(String),height(double),width(double)
//Member Function - double computeBMI()
//The above method should compute the BMI and return the result.
// The formula for computation of BMI  is weight (in kg) ÷ height*height(in metres).
//Create an object of the Patient class and check the results.
//Classes and Objects, Constructor, static
class Patient{
    String patientName;
    double height;
    double weight;
    Patient(String patientName, double height, double weight){
        this.patientName=patientName;
        this.height=height;
        this.weight=weight;
    }
   double computeBMI(){
        return weight / (height*height);
    }
}
public class Class3 {
    public static void main(String[] args) {
        Patient patient = new Patient("Kumar", 1.72, 48);
        System.out.printf("BMI is %.1f",patient.computeBMI());
    }
}
