import java.util.Random;
import java.util.Scanner;

import com.empresa.minecraft.Personaje;
import com.empresa.minecraft.mob.MobHostil;
import com.empresa.minecraft.mob.Zombie;
import com.empresa.minecraft.mob.Mob;

import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        System.out.println("Hola Que lo que, diviertete un rato");

        System.out.println("¿Qué arma quieres que lleve el personaje?");
        System.out.println("Opciones: Ninguna, Espada de madera, Espada de hierro, Espada de diamante");
        String armamento = scanner.nextLine();

        

        System.out.println("¿Qué armadura quieres que lleve el personaje?");
        System.out.println("Opciones: Ninguna, De cuero, De hierro, De diamante");
        String armadura = scanner.nextLine();





        int fuerza = tenerFuerza(armamento);
        int defensa = tenerDefensa(armadura);



        Personaje personaje = new Personaje(defensa, fuerza);
        MobHostil mobHostil = new Zombie(10, 4);


        int turno = 0;

        while (personaje.getSalud() > 0 && mobHostil.getSalud() > 0) {
            int dañoPersonaje = personaje.atacar();
            mobHostil.recibirAtaque(dañoPersonaje);
            int opcion = random.nextInt(2);
            if (opcion == 0) {
                mobHostil.moverse();
            } else {
                int dañoMobHostil = mobHostil.atacar();
                personaje.recibirAtaque(dañoMobHostil);
            }
            turno++;
        }
        if (personaje.getSalud() <= 0) {
            System.out.println("Perdiste JAJAJAJA, que pringado, el mob hostil te derroto.");
        }else {
            System.out.println("EY RESPECT, ganaste, derrotaste al mob hostil.");
        }
        System.out.println("El combate duro " + turno + " turnos.");
        }

        private static int tenerFuerza(String armamento) {
            switch (armamento) {
                case "Ninguna":
                    return 1;
                case "Espada de madera":
                    return 2;
                case "Espada de hierro":
                    return 3;
                case "Espada de diamante":
                    return 4;
                default:
                return 1;
            }    
        }


        private static int tenerDefensa(String armadura) {
            switch (armadura) {
                case "Ninguna":
                    return 0;
                case "De cuerpo":
                    return 1;
                case "De hierro":
                    return 2;
                case "De diamante":
                    return 3;
                default:
                    return 0;
            }
        }
}

