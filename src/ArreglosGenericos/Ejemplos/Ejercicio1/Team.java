package ArreglosGenericos.Ejemplos.Ejercicio1;

import java.util.ArrayList;

public class Team<T>{
    // Attributes;
    private String name;
    private ArrayList<T> players;

    // Constructor;
    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    // Metodos;
    public void addPlayer(T player){
        players.add(player);
    }
    public void showPlayers(){
        System.out.println("Jugadores del equipo: " + name);
        for (T player : players){
            System.out.println(player);
        }
    }
}
