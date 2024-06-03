package Excepciones.Actividad2;

public class Persona {
    // Attributes;
    private String nombre;
    private int dni;

    // constructors
    public Persona() {
    }
    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    // metodos
    public String toString(){
        return "Persona[nombre: " + nombre + ", Dni: " + dni + "]";
    }
}
