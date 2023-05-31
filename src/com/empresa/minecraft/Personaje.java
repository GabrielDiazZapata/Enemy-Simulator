package com.empresa.minecraft;

import com.empresa.minecraft.interfaces.Combate;

public class Personaje implements Combate {
    private int salud ;
    private int defensa;
    private int fuerza;


    public Personaje(int defensa, int fuerza) {
        this.salud = 12;
        this.fuerza = fuerza;
        this.defensa = defensa;
    }

    
    public int atacar() {
        return fuerza;
    }

    
    public void recibirAtaque(int ataque) {
        int dañoRecibido = ataque - defensa;
        salud -= dañoRecibido;

        System.out.println("Le acaban de mandar una ostia al personaje de " + dañoRecibido);
        System.out.println("Le queda " + salud + " para que se te vaya al cementerio de cabeza");
        
    }
}
