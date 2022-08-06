package LibrosDigitales;

public class LibroDigital extends Libro {

    //ATRIBUTOS
    private double espacioEnDisco, datosTransferidos;
    private String formato;

    //CONSTRUCTOR
    public LibroDigital(double espacioEnDisco, String formato, String titulo, String nombreAutor, String apellidosAutor, String fechaPublicacion, int numeroPaginas, int prestamos) {
        super(titulo, nombreAutor, apellidosAutor, fechaPublicacion, numeroPaginas, prestamos);
        this.espacioEnDisco = espacioEnDisco;
        this.formato = formato;
        this.datosTransferidos = espacioEnDisco * prestamos;
    }
    
    //MÉTODO prestar() DE LA CLASE LibroDigital.
    //RECUERDE QUE ES UN MÉTODO SOBREESCRITO DE
    //LA CLASE PADRE Libro. USE LA INSERCIÓN DE
    //CÓDIGO DE NETBEANS.
    @Override
    public void prestar() {
        //AGREGUE LO QUE FALTA DEL MÉTODO prestar()
        //NO SE PREOCUPE POR EL RESTO DEL MÉTODO
        //prestar() DE ESTA CLASE, YA VIENE AGREGADO
        //A CONTINUACIÓN
        double datosSubidos = getDatosTransferidos();
        datosSubidos =  datosSubidos + espacioEnDisco;
        setDatosTransferidos(datosSubidos);
    }

    //GETTERS Y SETTERS

    public double getEspacioEnDisco() {
        return espacioEnDisco;
    }

    public void setEspacioEnDisco(double espacioEnDisco) {
        this.espacioEnDisco = espacioEnDisco;
    }

    public double getDatosTransferidos() {
        return datosTransferidos;
    }

    public void setDatosTransferidos(double datosTransferidos) {
        this.datosTransferidos = datosTransferidos;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
}
