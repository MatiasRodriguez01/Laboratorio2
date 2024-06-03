package TP_1;
import java.util.*;
public class Flota  extends Avion{
    private List<Avion> aviones;

    public Flota() {
        this.aviones = new ArrayList<>();
    }

    public void agregarAvion(Avion avion) {
        aviones.add(avion);
    }

    public void despegarTodos() {
        for (Avion avion : aviones) {
            avion.volar();
        }
    }

    public void removerAvion(Avion avion) {
        aviones.remove(avion);
    }
}
