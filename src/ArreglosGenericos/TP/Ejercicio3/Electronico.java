package ArreglosGenericos.TP.Ejercicio3;

public class Electronico extends Producto{

    public Electronico(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public String toString(){
        return "Electrinco[nombre: " + nombre + ", precio: " + precio + "]";
    }
}
