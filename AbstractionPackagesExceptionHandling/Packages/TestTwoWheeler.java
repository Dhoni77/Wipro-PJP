package com;

import com.automobile.twowheeler.*;


public class TestTwoWheeler {
    public static void main(String[] args) {
        Hero hero = new Hero("XYZ","123","Rahul",50);
        System.out.printf("Model : %s%nReg. No. : %s%nOwner : %s%nSpeed : %d%n", hero.getModelName(), hero.getRegistrationNumber(), hero.getOwnerName(), hero.getSpeed());
        hero.radio();

        Honda honda=new Honda("ABC","456","Kiran",76);
        System.out.printf("Model : %s%nReg. No. : %s%nOwner : %s%nSpeed : %d%n", honda.getModelName(), honda.getRegistrationNumber(), honda.getOwnerName(), honda.getSpeed());
        honda.cdplayer();
    }
}
