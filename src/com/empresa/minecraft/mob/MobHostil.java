package com.empresa.minecraft.mob;

import com.empresa.minecraft.interfaces.Combate;

public abstract class MobHostil extends Mob implements Combate {
    private int fuerza;
    
    public MobHostil(int salud, int fuerza) {
        super(salud);
        this.fuerza = fuerza;
    }

    public int atacar() {
        return fuerza;
    }


    public void recibirAtaque(int ataque){
        int saludActual = getSalud();
        saludActual -= ataque;
        setSalud(saludActual);
        System.out.println("El bicho recibio " + ataque + " de daño casi lo matas bro");
        System.out.println("Al bicho le queda " + getSalud() + " ya casi otra ostia mas");
        
    }
    
    
}
