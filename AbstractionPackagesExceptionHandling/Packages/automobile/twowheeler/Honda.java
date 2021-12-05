package com.automobile.twowheeler;

import com.automobile.Vehicle;

//Honda class extends com.automobile.vehicle class with the following methods
//public int getSpeed()
//– Returns the current speed of the vehicle.
//public void cdplayer()
//– provides facility to control the cd player device which is available in the car.
public class Honda extends Vehicle {
    String ModelName;
    String RegistrationNumber;
    String OwnerName;
    int speed;
    public Honda(String ModelName, String RegistrationNumber, String OwnerName, int speed){
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

    public void cdplayer(){
        System.out.println("Cd Player controls");
    }
}
