package com.empresa.minecraft.mob;

import com.empresa.minecraft.interfaces.Daño;

public abstract class MobPacifico extends Mob implements Daño{

    public MobPacifico(int salud) {
        super(salud);
    }

    public void recibirAtaque(int ataque) {
        int saludActual = getSalud();
        saludActual -= ataque;
        setSalud(saludActual);
        System.out.println("Chacho que te hico el pobre animalito, le hiciste " + ataque + " de daño.");
    }
}
