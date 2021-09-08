package com.company;

import java.sql.SQLOutput;

public class Boss extends GameEntity {
    private String Defense;
    public Boss(String Entity, int Health, int Damage, String Defense, String NameOfWeapon, String TypeOfWeapon){
        super(Entity, Health, Damage, NameOfWeapon, TypeOfWeapon);
        this.Defense = Defense;
    }
    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("Defense:" + Defense);
    }
}


