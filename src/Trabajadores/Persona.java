package Trabajadores;

import java.time.LocalDate;
import java.time.Period;  
public class Persona {
    // ATRIBUTOS
    String identificacion, nombre, apellidos, fechaNacimiento, email,telefono;

    // CONSTRUCTOR
    public Persona(String identificacion, String nombre, String apellidos, String fechaNacimiento, String email, String telefono) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
    }
    
    // METODO -> NO MODIFICAR NI ELIMINAR
    public int calcularEdad() {  
        // El método parse() retorna una instancia de LocalDate recibiendo una fecha como string
        LocalDate dob = LocalDate.parse(this.fechaNacimiento);  
        // Se obtiene la fecha actual del sistema
        LocalDate curDate = LocalDate.now();  
        // Se calcula la cantidad de tiempo entre fechas y se seleccionan los años
        if ((dob != null) && (curDate != null)) {  
            return Period.between(dob, curDate).getYears();  
        } else {  
            return 0;  
        }  
    }  
    
    // GETTERS Y SETTERS

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
