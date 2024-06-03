package TP_1;

public class Equipaje {
    private int equipajeKg;

    public Equipaje(int equipajeKg) {
        setEquipajeKg(equipajeKg);
    }

    public int getEquipajeKg() {
        return equipajeKg;
    }

    public void setEquipajeKg(int equipajeKg) {
        if (equipajeKg >= 0) {
            this.equipajeKg = equipajeKg;
        } else {
            throw new IllegalArgumentException("El peso del equipaje debe ser no negativo.");
        }
    }
}
