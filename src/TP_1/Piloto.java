package TP_1;

public class Piloto extends Persona implements Volador {
    private String rango;

    public Piloto() {}

    public Piloto(int edad, String nombre, String rango) {
        super(edad, nombre);
        setRango(rango);
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        if (rango != null && !rango.isEmpty()) {
            this.rango = rango;
        } else {
            throw new IllegalArgumentException("El rango no puede estar vacío.");
        }
    }

    @Override
    public void volar() {
        System.out.println("El piloto " + getNombre() + " con rango " + rango + " está volando.");
    }
}
