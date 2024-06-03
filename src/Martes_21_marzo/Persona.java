package Martes_21_marzo;

import java.util.ArrayList;

public class Persona {

    //// Atributes;
    private String nombre;
    private int edad;
    private EstadoCivil estadoCivil;
    private Persona[] padre = new Persona[2];
    private ArrayList<Persona> hijos = new ArrayList<>();

    // Constructs;
    public Persona(){}
    public Persona(String nombre, int edad, EstadoCivil estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }

    /// Getters ans setters;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Persona[] getPadre() {
        return padre;
    }

    public void setPadre(Persona[] padre) {
        this.padre = padre;
    }

    public ArrayList<Persona> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<Persona> hijos) {
        this.hijos = hijos;
    }

    /// MEtodos;
    public void comer(){
        System.out.println("Estoy comiendo");
    }
    public int caminar(String lugar, int km){
        int pasos = km/1000;
        System.out.println("Estoy caminando por " + lugar);
        return pasos;
    }
    public void agregarHijos(Persona hijo){
        this.hijos.add(hijo);
    }
    public void agregarPadre(Persona padre){
        for(int i = 0; i<2; i++){
            if(this.padre[i] == null){
                this.padre[i] = padre;
            }
        }
    }
}
