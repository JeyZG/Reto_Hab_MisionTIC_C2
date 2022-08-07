package Trabajadores;

import java.util.ArrayList;

public class Solucion {
    public static Object[] reportes(ArrayList<Trabajador> trabajadores) {

        double promSalarios, promHorasMes, promEdades;
        int sumaSalarios = 0, sumaHorasMes = 0, sumaEdades = 0;
        String trabajadorMayorHoras = "";
        int mayorCantidadHoras = Integer.MIN_VALUE;

        for (Trabajador trabajador : trabajadores) {

            // Calculamos el total del pago de la nomina
            sumaSalarios += trabajador.getSalarioMensual();

            // Calculamos la suma de horas trabajadas
            sumaHorasMes += trabajador.getHorasTrabajadas();

            // Calculamos la suma de edades de los trabajadores
            sumaEdades += trabajador.calcularEdad();

            // Buscamos al trabajador con mayor horas trabajadas
            if (mayorCantidadHoras < trabajador.getHorasTrabajadas()) {
                mayorCantidadHoras = trabajador.getHorasTrabajadas();
                trabajadorMayorHoras = trabajador.getIdentificacion();
            }

        }

        // Calculamos el promedio de salarios
        promSalarios = sumaSalarios / trabajadores.size();
        // TODO: Si hay error en VPL hacer casting a double a sumaSalarios

        // Calculamos el promedio de horas trabajadas
        promHorasMes = (double) sumaHorasMes / trabajadores.size();

        // Calculamos el promedio de edades
        promEdades = (double) sumaEdades / trabajadores.size();

        return new Object[]{promSalarios, promHorasMes, sumaSalarios, trabajadorMayorHoras, promEdades};

    }
}