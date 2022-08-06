package Trabajadores;

import java.util.ArrayList;
public class Solucion {
    public static Object[] reportes(ArrayList<Trabajador> trabajadores) {
        //EN ESTE ESPACIO PONER SU LÓGICA

        double promedioSalarios = 0.0;
        double promedioHorasMes = 0.0;
        int totalPagoNomina = 0;
        String trabajadorMayorHoras = "";
        double promedioEdades = 0.0;

        int edadesTrabajadores = 0;
        int horasTrabajadas = 0;
        int mayorCantidadHoras = 0;

        Object[] reporte = new Object[] {promedioSalarios, promedioHorasMes, totalPagoNomina, trabajadores.get(0).getIdentificacion(), promedioEdades};

        for (Trabajador trabajador : trabajadores) {

            // Calculamos el total del pago de la nomina
            reporte[2] = (int) reporte[2] + trabajador.getSalarioMensual();

            // Calculamos la cantidad de horas trabajadas
            horasTrabajadas += trabajador.getHorasTrabajadas();

            // Buscamos al trabajador con mayor horas trabajadas
            if (mayorCantidadHoras < trabajador.getHorasTrabajadas()) {
                mayorCantidadHoras = trabajador.getHorasTrabajadas();
                reporte[3] = trabajador.getIdentificacion();
            }

            // Se calcula la edad con el metodo de la clase Persona
            edadesTrabajadores += trabajador.calcularEdad();
        }

        // Calculamos el promedio de salarios
        reporte[0] = (double)((int)reporte[2] / trabajadores.size());

        // Calculamos el promedio de horas trabajadas
        reporte[1] = (double) horasTrabajadas / trabajadores.size();

        // Calculamos el promedio de edades
        reporte[4] = (double) edadesTrabajadores / trabajadores.size();

        return reporte;

    }
}