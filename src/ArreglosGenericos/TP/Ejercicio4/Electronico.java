package ArreglosGenericos.TP.Ejercicio4;

public class Electronico extends Producto{

    public Electronico(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Electrónico: " + getNombre();
    }
}
