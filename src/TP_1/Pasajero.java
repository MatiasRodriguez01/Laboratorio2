package TP_1;

public class Pasajero extends Persona{

    private Equipaje equipaje;
    private int numPasaje;

    public Pasajero() {}

    public Pasajero(int edad, String nombre, int numPasaje, Equipaje equipaje) {
        super(edad, nombre);
        setNumPasaje(numPasaje);
        this.equipaje = equipaje;
    }

    public Equipaje getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(Equipaje equipaje) {
        this.equipaje = equipaje;
    }

    public int getNumPasaje() {
        return numPasaje;
    }

    public void setNumPasaje(int numPasaje) {
        if (numPasaje > 0) {
            this.numPasaje = numPasaje;
        } else {
            throw new IllegalArgumentException("El número de pasaje debe ser positivo.");
        }
    }

    ///
    public void mostrar(){
        System.out.println("- nombre del pasajero: " + getNombre());
        System.out.println("- edad: " + getEdad());
        System.out.println("- numero del pasaje: " + numPasaje);
        System.out.println("- Equipaje pesa: " + equipaje.getEquipajeKg());
    }
}
