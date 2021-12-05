package com.automobile.fourwheeler;

import com.automobile.Vehicle;
//Create FourWheeler subpackage under automobile package
//Logan class extends com.automobile.Vehicle class
//public int speed()
//– Returns the current speed of the vehicle.
//public int gps()
//– provides facility to control the gps device
public class Logan extends Vehicle{
    String ModelName;
    String RegistrationNumber;
    String OwnerName;
    int speed;
    int gps;

    public Logan(String ModelName, String RegistrationNumber, String OwnerName, int speed, int gps){
        this.ModelName=ModelName;
        this.RegistrationNumber=RegistrationNumber;
        this.OwnerName=OwnerName;
        this.speed=speed;
        this.gps=gps;
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

    public int getGps() {
        return gps;
    }

    public void setGps(int gps) {
        this.gps = gps;
    }

}
