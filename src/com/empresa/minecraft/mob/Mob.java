package com.empresa.minecraft.mob;
public abstract class Mob {
    protected int salud;


    public Mob(int salud) {
        this.salud = salud;
    }


    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public abstract void moverse();
    
    
}
