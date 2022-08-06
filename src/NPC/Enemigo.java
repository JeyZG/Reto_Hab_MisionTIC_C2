package NPC;

public class Enemigo extends Personaje{
    //ATRIBUTOS
    private double vida;
    private int capacidadDeDano;
    private String especieMutante;
    
    //CONSTRUCTOR
    public Enemigo(String identificador, String apodo, String rol, double posicionX, double posicionY, double velocidad, int nivel, double vida, int capacidadDeDano, String especieMutante) {
        super(identificador, apodo, rol, posicionX, posicionY, velocidad, nivel);
        this.vida = vida;
        this.capacidadDeDano = capacidadDeDano;
        this.especieMutante = especieMutante;
    }
    
    //GETTERS Y SETTERS

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public int getCapacidadDeDano() {
        return capacidadDeDano;
    }

    public void setCapacidadDeDano(int capacidadDeDano) {
        this.capacidadDeDano = capacidadDeDano;
    }

    public String getEspecieMutante() {
        return especieMutante;
    }

    public void setEspecieMutante(String especieMutante) {
        this.especieMutante = especieMutante;
    }

    @Override
    public String toString() {
        return "Enemigo(" +
                "\"" + getIdentificador() + '\"' +
                ", \"" + getApodo() + '\"' +
                ", \"" + getRol() + '\"' +
                ", " + getPosicionX() +
                ", " + getPosicionY() +
                ", " + getVelocidad() +
                ", " + getNivel() +
                ", " + vida +
                ", " + capacidadDeDano +
                ", \"" + especieMutante  + '\"' +
                ");" + "\n";
    }
}