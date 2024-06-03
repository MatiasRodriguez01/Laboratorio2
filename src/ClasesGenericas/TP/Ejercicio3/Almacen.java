package ArreglosGenericos.TP.Ejercicio3;

import java.util.ArrayList;

public class Almacen<T extends Producto> {
    // Attributes
    private ArrayList<T> productos;
    // Constructor
    public Almacen() {
        this.productos = new ArrayList<>();
    }
    // metodos
    public void agregarProducto(T producto){
        productos.add(producto);
    }

    public void imprimirProductos(){
        imprimirLista(productos);
    }

    public void imprimirLista(ArrayList<? extends Producto> productos){
        System.out.println("Lista de productos:");
        for (Producto producto : productos){
            System.out.println(" * " + producto);
        }
    }
}
