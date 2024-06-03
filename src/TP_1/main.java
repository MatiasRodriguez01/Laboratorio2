package TP_1;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        // Creando instancias de Equipaje
        Equipaje equipaje1 = new Equipaje(15);
        Equipaje equipaje2 = new Equipaje(25);
        Equipaje equipaje3 = new Equipaje(10);

        // Creando Pasajeros
        Pasajero pasajero1 = new Pasajero(30, "Juan", 1, equipaje1);
        Pasajero pasajero2 = new Pasajero(28, "Lucia", 2, equipaje2);
        Pasajero pasajero3 = new Pasajero(35, "Sofia", 3, equipaje3);

        // Creando Vuelo
        Vuelo vuelo1 = new Vuelo(1001, null); // Se establecerá la reserva más adelante
        Vuelo vuelo2 = new Vuelo(1002, null); // Se establecerá la reserva más adelante

        // Creando Reservas
        Reserva reserva1 = new Reserva(pasajero1, 1, vuelo1);
        Reserva reserva2 = new Reserva(pasajero2, 2, vuelo2);
        Reserva reserva3 = new Reserva(pasajero3, 3, vuelo1);

        // Estableciendo reservas en los vuelos
        vuelo1.setReserva(reserva1);
        vuelo1.setReserva(reserva3);
        vuelo2.setReserva(reserva2);

        // Creando Aviones
        Avion avion1 = new Avion("ABC123");
        Avion avion2 = new Avion("XYZ789");

        // Estableciendo vuelos asociados a los aviones
        avion1.setVueloAsociado(vuelo1);
        avion2.setVueloAsociado(vuelo2);

        // Creando Piloto
        Piloto piloto1 = new Piloto(45, "Carlos", "Capitán");
        Piloto piloto2 = new Piloto(38, "Ana", "Teniente");

        // Haciendo que los pilotos vuelen los aviones
        System.out.println("\nLos pilotos están volando los aviones:");
        piloto1.volar();
        piloto2.volar();

        // Creando Flota
        Flota flota = new Flota();
        flota.agregarAvion(avion1);
        flota.agregarAvion(avion2);

        // Mostrando detalles de los pasajeros
        System.out.println("\nDetalles de los pasajeros:");
        pasajero1.mostrar();
        System.out.println("-----------");
        pasajero2.mostrar();
        System.out.println("-----------");
        pasajero3.mostrar();

        // Despegando todos los aviones de la flota
        System.out.println("\nHaciendo que todos los aviones de la flota despeguen:");
        flota.despegarTodos();

        // Removiendo un avión de la flota
        System.out.println("\nRemoviendo el avión con patente " + avion2.getPatente() + " de la flota.");
        flota.removerAvion(avion2);
        System.out.println("\nHaciendo que los aviones restantes de la flota despeguen:");
        flota.despegarTodos();
    }
}
