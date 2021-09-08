package com.company;

public class GameEntity extends Weapon{
    GameEntity(String Entity, int Health, int Damage, String TypeOfWeapon, String NameOfWeapon){
        this.Entity = Entity;
        this.Health = Health;
        this.Damage = Damage;
        this.NameOfWeapon = NameOfWeapon;
        this.TypeOfWeapon = TypeOfWeapon;

    }
    private String Entity;
    private int Health;
    private int Damage;

    public void setTypeOfWeapon(String TypeOfWeapon){
        this.TypeOfWeapon = TypeOfWeapon;
    }
    public String getTypeOfWeapon(){
        return TypeOfWeapon;
    }
    public void setNameOfWeapon(String NameOfWeapon){
        this.NameOfWeapon = NameOfWeapon;
    }
    public String getNameOfWeapon(){
        return NameOfWeapon;
    }

    public String getEntity() {
        return Entity;
    }

    public void setName(String Entity) {
        this.Entity = Entity;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }
    public void getInfo(){


        System.out.println("Entity: " + getEntity());
        System.out.println("Health: " + getHealth());
        System.out.println("Damage: " + getDamage());
        System.out.println("Weapon :" + NameOfWeapon);
        System.out.println("Type of Weapon :" + TypeOfWeapon);
    }
    }

