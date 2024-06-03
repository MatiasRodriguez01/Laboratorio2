package ArreglosGenericos.TP.Ejercicio4;

public class Producto {
    private String nombre;

    public Producto(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Producto: " + nombre;
    }
}
