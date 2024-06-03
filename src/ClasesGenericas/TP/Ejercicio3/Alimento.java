package ArreglosGenericos.TP.Ejercicio3;

public class Alimento extends Producto{

    public Alimento(String nombre, double precio) {
        super(nombre, precio);
    }
    @Override
    public String toString() {
        return "Electrónico[nombre: " + nombre + ", precio: " + precio + "]";
    }
}
