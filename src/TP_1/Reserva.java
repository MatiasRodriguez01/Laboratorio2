package TP_1;

public class Reserva {
    private int numAsiento;
    private Pasajero pasajero;
    private Vuelo vuelo;

    public Reserva() {}

    public Reserva(Pasajero pasajero, int numAsiento, Vuelo vuelo) {
        this.pasajero = pasajero;
        setNumAsiento(numAsiento);
        this.vuelo = vuelo;
    }

    public int getNumAsiento() {
        return numAsiento;
    }

    public void setNumAsiento(int numAsiento) {
        if (numAsiento > 0) {
            this.numAsiento = numAsiento;
        } else {
            throw new IllegalArgumentException("El número de asiento debe ser positivo.");
        }
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

    public boolean pasajeroAbordo(Pasajero pasajero) {
        return this.pasajero.equals(pasajero);
    }
}
