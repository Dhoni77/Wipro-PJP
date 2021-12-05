package com;

import com.automobile.fourwheeler.*;

public class TestFourWheeler {
    public static void main(String[] args) {

        Logan logan=new Logan("Logan","123","Rahul",50, 10);
        System.out.printf("Model : %s%nReg. No. : %s%nOwner : %s%nSpeed : %d%nGps : %d%n", logan.getModelName(), logan.getRegistrationNumber(), logan.getOwnerName(), logan.getSpeed(), logan.getGps());
        Ford ford=new Ford("Ford","1233","Raj",30, 10);
        System.out.printf("Model : %s%nReg. No. : %s%nOwner : %s%nSpeed : %d%nTempControl : %d%n", ford.getModelName(), ford.getRegistrationNumber(), ford.getOwnerName(), ford.getSpeed(),ford.getTempControl());

    }
}
