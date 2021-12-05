package com.automobile.fourwheeler;

import com.automobile.Vehicle;

//Ford class extends  com.automobile.Vehicle class
//public int speed()
//– Returns the current speed of the vehicle.
//public int tempControl()
//– provides facility to control the air conditioning device which is available in the car
public class Ford extends Vehicle{
    String ModelName;
    String RegistrationNumber;
    String OwnerName;
    int speed;
    int tempControl;
    public Ford(String ModelName, String RegistrationNumber, String OwnerName, int speed, int tempControl){
        this.ModelName=ModelName;
        this.RegistrationNumber=RegistrationNumber;
        this.OwnerName=OwnerName;
        this.speed=speed;
        this.tempControl=tempControl;
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

    public int getTempControl() {
        return tempControl;
    }

    public void setTempControl(int tempControl) {
        this.tempControl = tempControl;
    }
}
