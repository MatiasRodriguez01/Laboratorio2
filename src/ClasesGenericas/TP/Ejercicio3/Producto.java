package ArreglosGenericos.TP.Ejercicio3;

public abstract class Producto {
    // Attributes
    protected String nombre;
    protected double precio;
    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    // Getters and setters

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected double getPrecio() {
        return precio;
    }

    protected void setPrecio(double precio) {
        this.precio = precio;
    }

    // Metodos
    public String toString(){
        return "producto[nombre: " + nombre + ", precio: " + precio + "]";
    }
}
