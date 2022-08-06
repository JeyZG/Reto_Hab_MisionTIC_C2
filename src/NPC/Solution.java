package NPC;

import java.util.ArrayList;
public class Solution {

    public static Object[] statisticsGame(ArrayList<Enemigo> enemies) {
        //System.out.println(enemies.toString());

        double sumaVidas = 0.0, sumaDanios = 0.0, sumaVelocidades=0.0;
        double promVida, promCapacidadDanio, promVelicidades;
        double vidaMasAlta = Double.MIN_VALUE;
        double vidaMasBaja = Double.MAX_VALUE;

        for (Enemigo enemigo : enemies) {

            // Calculamos la suma de la vida de los enemigos
            sumaVidas += enemigo.getVida();

            // Calculamos la suma del daño de los enemigos
            sumaDanios += enemigo.getCapacidadDeDano();

            // Calculamos la suma de la velocidad de los enemigos
            sumaVelocidades += enemigo.getVelocidad();

            // Buscamos al enemigo con la cantidad de vida mas alta (menos golpes recibidos)
            if (vidaMasAlta < enemigo.getVida()) {
                vidaMasAlta = enemigo.getVida();
            }

            // Buscamos al enemigo con la cantidad de vida mas baja (mas golpes recibidos)
            if (vidaMasBaja > enemigo.getVida()) {
                vidaMasBaja = enemigo.getVida();
            }
        }

        // Calculamos el promedio de vida de los enemigos
        promVida =  sumaVidas / enemies.size();

        // Calculamos el promedio de daño de los enemigos
        promCapacidadDanio = sumaDanios / enemies.size();

        // Calculamos el promedio de velocidades de los enemigos
        promVelicidades = sumaVelocidades / enemies.size();

        return new Object[] {promVida, promCapacidadDanio, vidaMasAlta, vidaMasBaja, promVelicidades};

    }
}