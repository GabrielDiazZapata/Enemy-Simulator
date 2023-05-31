package com.empresa.minecraft.mob;

public class Zombie extends MobHostil {
    public Zombie(int salud, int fuerza){
        super(10, 4);
    }

    public void moverse(){
        System.out.println("El zombie se acerca loco que vas hacer");
    }
}