package Trabajadores;

public class Trabajador extends Persona {
    //ATRIBUTOS
    private String cargo;
    private int salarioMensual;
    private int horasTrabajadas;

    //CONSTRUCTOR
    public Trabajador(String identificacion, String nombre, String apellidos, String fechaNacimiento, String email, String telefono, String cargo, int salarioMensual, int horasTrabajadas) {
        super(identificacion, nombre, apellidos, fechaNacimiento, email, telefono);
        this.cargo = cargo;
        this.salarioMensual = salarioMensual;
        this.horasTrabajadas = horasTrabajadas;
    }

    //GETTERS Y SETTERS

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
