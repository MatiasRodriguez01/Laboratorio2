package TP_1;

public class Avion implements Volador {
    private String patente;
    private Vuelo vueloAsociado;

    public Avion() {}

    public Avion(String patente) {
        setPatente(patente);
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        if (patente != null && !patente.isEmpty()) {
            this.patente = patente;
        } else {
            throw new IllegalArgumentException("La patente no puede estar vacía.");
        }
    }

    public Vuelo getVueloAsociado() {
        return vueloAsociado;
    }

    public void setVueloAsociado(Vuelo vueloAsociado) {
        this.vueloAsociado = vueloAsociado;
    }

    @Override
    public void volar() {
        System.out.println("El avión con patente " + patente + " está volando.");
    }
}
