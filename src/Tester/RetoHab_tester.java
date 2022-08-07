package Tester;

import java.util.ArrayList;
import java.util.Arrays;

import NPC.*;
import LibrosDigitales.*;
import Trabajadores.*;


public class RetoHab_tester {
    public static void main(String[] args) {

        NPC_tester();
        LibrosDigitales_tester();
        Trabajadores_tester();

    }

    private static void NPC_tester() {

        ArrayList<Enemigo> t3 = new ArrayList<>();
        t3.add(new Enemigo("1037543456", "Zombiembobo", "Enemigo", 3, 6, 1, 0, 20, 1, "basic zombie"));
        t3.add(new Enemigo("1037543457", "Zombimax", "Enemigo", 4, 6, 1.5, 1, 30, 2, "powered zombie"));
        t3.add(new Enemigo("1037543458", "Zombiembobo", "Enemigo", 3, 7, 1, 0, 20, 1, "basic zombie"));
        t3.add(new Enemigo("1037543410", "Zombiembobo", "Enemigo", 4, 7, 1, 0, 20, 1, "basic zombie"));
        t3.add(new Enemigo("1037543459", "Zombisaurio", "Enemigo", 3, 8, 0.5, 5, 89.9, 10, "super powered zombie"));
        t3.add(new Enemigo("1037543411", "Zombimax", "Enemigo", 4, 8, 1.5, 1, 30, 2, "powered zombie"));
        t3.add(new Enemigo("1037543412", "Zombiembobo", "Enemigo", 3, 9, 1, 0, 20, 1, "basic zombie"));
        t3.add(new Enemigo("1037543413", "Zombimax", "Enemigo", 4, 9, 1.5, 1, 30, 2, "powered zombie"));

        Object[] reporteResultado = NPC.Solution.statisticsGame(t3);
        System.out.println(Arrays.toString(reporteResultado));
    }

    private static void LibrosDigitales_tester() {

        ArrayList<LibroDigital> biblioteca = new ArrayList<>();
        biblioteca.add(new LibroDigital(2.4, "DJVU", "Memorias de Adriano", "Margueritte", "Yourcenar", "1950/04/24", 245, 2));
        biblioteca.add(new LibroDigital(4, "PDF", "Java para Todos", "Joseph", "Whitecastle", "2010/08/02", 202, 5));
        biblioteca.add(new LibroDigital(2.2, "HTML", "La Iliada", "Homero", "", "1970/04/24", 204, 7));
        biblioteca.add(new LibroDigital(8, "EPUB", "1984", "George", "Orwell", "1980/11/03", 259, 7));
        LibroDigital libro5 = new LibroDigital(2.0, "DJVU", "Algebra", "Aurelio", "Baldor", "1941/06/19", 574, 3);
        for (int i = 0; i < 26; i++) {
            libro5.prestar();
        }
        biblioteca.add(libro5);
        biblioteca.add(new LibroDigital(3, "PDF", "Mujeres Que Corren Con Los Lobos", "Clarissa", "Pinkola Estés", "1989/05/28", 600, 8));
        Object[] reporteResultado = LibrosDigitales.Solucion.reporte(biblioteca);
        System.out.println(Arrays.toString(reporteResultado));
    }

    private static void Trabajadores_tester() {

        ArrayList<Trabajador> grupo1 = new ArrayList<>();
        grupo1.add(new Trabajador("1037543456", "Mateo", "Rivera", "1992-08-11", "matr@mail.co", "1234567", "frontend dev", 50, 4));
        //Respuesta esperaba: [50.0, 4.0, 50, 1037543456, 29.0] // Hasta el 10 de Agosto
        //Respuesta esperaba: [50.0, 4.0, 50, 1037543456, 30.0] // Desde el 11 de Agosto

        ArrayList<Trabajador> grupo2 = new ArrayList<>();
        grupo2.add(new Trabajador("32675123", "Luz", "Di", "1966-01-04", "matr@mail.co", "1234567", "frontend dev", 10, 7));
        grupo2.add(new Trabajador("81200306", "John", "Doe", "1969-10-17", "matr@mail.co", "1234567", "frontend dev", 10, 16));
        //Respuesta esperaba: [10.0, 11.5, 20, 81200306, 54.0]

        ArrayList<Trabajador> grupo3 = new ArrayList<>();
        grupo3.add(new Trabajador("10367876345", "Valeria", "Di", "1971-07-25", "matr@mail.co", "1234567", "frontend dev", 8, 8));
        grupo3.add(new Trabajador("1037645345", "Johan", "Doe", "1971-08-06", "matr@mail.co", "1234567", "frontend dev", 9, 17));
        grupo3.add(new Trabajador("98765234", "Maurice", "Doe", "1992-08-11", "matr@mail.co", "1234567", "frontend dev", 2, 19));
        //Respuesta esperaba: [6.0, 14.666666666666666, 19, 98765234, 43.333333333333336] // Hasta el 5 de Agosto (51 + 50 + 29) / 3
        //Respuesta esperaba: [6.0, 14.666666666666666, 19, 98765234, 43.666666666666664] // Entre el 6 y 10 de Agosto (51 + 51 + 29) / 3
        //Respuesta esperaba: [6.0, 14.666666666666666, 19, 98765234, 44.0] // Despues del 11 de Agosto (51 + 51 + 30) / 3

        ArrayList<Trabajador> grupo4 = new ArrayList<>();
        grupo4.add(new Trabajador("10367876345", "Valeria", "Di", "1992-08-11", "matr@mail.co", "1234567", "frontend dev", 8, 7));
        grupo4.add(new Trabajador("1037645345", "Johan", "Doe", "1972-07-25", "matr@mail.co", "1234567", "frontend dev", 7, 15));
        grupo4.add(new Trabajador("98765234", "Maurice", "Doe", "1975-01-15", "matr@mail.co", "1234567", "frontend dev", 6, 17));
        grupo4.add(new Trabajador("1036789453", "Matthew", "Doe", "1976-11-16", "matr@mail.co", "1234567", "frontend dev", 2, 14));
        //Respuesta esperaba: [5.0, 13.25, 23, 98765234, 42.75] // Hasta el 10 de Agosto (29 + 50 + 47 + 45) / 4
        //Respuesta esperaba: [5.0, 13.25, 23, 98765234, 43.0] // Desde el 11 de Agosto (30 + 50 + 47 + 45) / 4

        ArrayList<Trabajador> grupo5 = new ArrayList<>();
        grupo5.add(new Trabajador("10367876345", "Valeria", "Di", "1984-12-09", "matr@mail.co", "1234567", "frontend dev", 8, 7));
        grupo5.add(new Trabajador("1037645345", "Johan", "Doe", "1992-08-11", "matr@mail.co", "1234567", "frontend dev", 7, 15));
        grupo5.add(new Trabajador("98765234", "Maurice", "Doe", "1986-01-29", "matr@mail.co", "1234567", "frontend dev", 6, 17));
        //Respuesta esperaba: [7.0, 13.0, 21, 98765234, 34.0] // Hasta el 10 de Agosto (37 + 29 + 36) / 3
        //Respuesta esperaba: [7.0, 13.0, 21, 98765234, 34.333333333333333] // Desde el 11 de Agosto (37 + 30 + 36) / 3

        Object[] reporteResultado1 = Trabajadores.Solucion.reportes(grupo1);
        System.out.println(Arrays.toString(reporteResultado1));

        Object[] reporteResultado2 = Trabajadores.Solucion.reportes(grupo2);
        System.out.println(Arrays.toString(reporteResultado2));

        Object[] reporteResultado3 = Trabajadores.Solucion.reportes(grupo3);
        System.out.println(Arrays.toString(reporteResultado3));

        Object[] reporteResultado4 = Trabajadores.Solucion.reportes(grupo4);
        System.out.println(Arrays.toString(reporteResultado4));

        Object[] reporteResultado5 = Trabajadores.Solucion.reportes(grupo5);
        System.out.println(Arrays.toString(reporteResultado5));
    }

}
