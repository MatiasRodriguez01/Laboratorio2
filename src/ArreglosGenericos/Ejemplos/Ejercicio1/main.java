package ArreglosGenericos.Ejemplos.Ejercicio1;

public class main {
    public static void main(String[] args) {
        // Crear la clase generica
        Team<String> equipo1 = new Team<>("Roma FC");
        // Agregar jugadores a al clase;
        equipo1.addPlayer("Dybala");
        equipo1.addPlayer("Lukaku");
        equipo1.addPlayer("Paredes");
        equipo1.addPlayer("Mancini");
        // Mostrarmos jugadores añadidos;
        equipo1.showPlayers();

        //Creamos otra clase generica;
        Team<Integer> equipo2 = new Team<>("Lakers");
        // Agregamos jugadores al equipo 2:
        equipo2.addPlayer(23);
        equipo2.addPlayer(8);
        equipo2.addPlayer(24);
        equipo2.addPlayer(32);
        // mostramos los jugadores;
        equipo2.showPlayers();

    }
}
