package LibrosDigitales;

import java.util.ArrayList;
public class Solucion {

    public static Object[] reporte(ArrayList<LibroDigital> library){
        //EN ESTE ESPACIO PONER SU LÓGICA

    String libroMasGrande = "", libroMenosPrestado = "", libroMayorTransferencia = "";
    int paginasLibroMasGrande = Integer.MIN_VALUE, cantPrestLibroMenosPrestado = Integer.MAX_VALUE;
    double cantTransfLibroMayorTransferencia = Double.MIN_VALUE;

        for (LibroDigital libro : library) {

            // Buscamos el nombre del libro con mas paginas y la cantidad de paginas del mismo
            if (paginasLibroMasGrande < libro.getNumeroPaginas()) {
                paginasLibroMasGrande = libro.getNumeroPaginas();
                libroMasGrande = libro.getTitulo();
            }

            // Buscamos el nombre del libro con menos prestamos y la cantidad de prestamos del mismo
            if (cantPrestLibroMenosPrestado > libro.getPrestamos()) {
                cantPrestLibroMenosPrestado = libro.getPrestamos();
                libroMenosPrestado = libro.getTitulo();
            }

            // Buscamos el nombre del libro con mas paginas y la cantidad de datos transferidos del mismo
            if (cantTransfLibroMayorTransferencia < libro.getDatosTransferidos()) {
                cantTransfLibroMayorTransferencia = libro.getDatosTransferidos();
                libroMayorTransferencia = libro.getTitulo();
            }
        }

        return new Object[] {libroMasGrande, paginasLibroMasGrande, libroMenosPrestado, cantPrestLibroMenosPrestado, libroMayorTransferencia, cantTransfLibroMayorTransferencia};

    }
    
}
