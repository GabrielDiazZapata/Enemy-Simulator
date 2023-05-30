package com.empresa.minecraft;

public class Personaje implements Combate {
    private int salud ;
    private int defensa;
    private int fuerza;


    public Personaje(int defensa, int fuerza) {
        this.salud = 12;
        this.fuerza = fuerza;
        this.defensa = defensa;
    }

    @Override
    public int atacar() {
        return fuerza;
    }

    @Override
    public recibirAtaque(int ataque) {
        int dañoRecibido = ataque - defensa;
        salud -= dañoRecibido;

        System.out.println("Le acaban de mandar una ostia al personaje de " + dañoRecibido);
        System.out.println("Le queda " + salud + " para que se te vaya al cementerio de cabeza");
    }
}
