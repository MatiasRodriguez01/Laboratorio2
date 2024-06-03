package TP_1;

public class Vuelo {
    private int numVuelo;
    private Reserva reserva;

    public Vuelo() {}

    public Vuelo(int numVuelo, Reserva reserva) {
        setNumVuelo(numVuelo);
        this.reserva = reserva;
    }

    public int getNumVuelo() {
        return numVuelo;
    }

    public void setNumVuelo(int numVuelo) {
        if (numVuelo > 0) {
            this.numVuelo = numVuelo;
        } else {
            throw new IllegalArgumentException("El número de vuelo debe ser positivo.");
        }
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }
}
