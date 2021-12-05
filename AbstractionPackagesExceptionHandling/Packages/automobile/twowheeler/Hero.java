package com.automobile.twowheeler;

import com.automobile.Vehicle;

//Create twowheeler subpackage under automobile package
//Hero  class extends  automobile.vehicle class with the following methods
//public int getSpeed()
//– returns the current speed of the vehicle.
//public void radio()
//– provides facility to control the radio device
public  class Hero extends Vehicle{
    String ModelName;
    String RegistrationNumber;
    String OwnerName;
    int speed;
    public Hero(String ModelName, String RegistrationNumber, String OwnerName, int speed){
        this.ModelName=ModelName;
        this.RegistrationNumber=RegistrationNumber;
        this.OwnerName=OwnerName;
        this.speed=speed;
    }
    @Override
    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    @Override
    public String getRegistrationNumber() {
        return RegistrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        RegistrationNumber = registrationNumber;
    }

    @Override
    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed(){
        return speed;
    }

    public void radio(){
        System.out.println("Radio Controls");
    }
}
