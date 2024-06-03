package ArreglosGenericos.TP.Ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear un almacén de productos electrónicos
        Almacen<Electronico> almacen = new Almacen<>();
        almacen.agregarElemento(new Electronico("Televisor"));
        almacen.agregarElemento(new Electronico("Computadora"));

        // Obtener la lista de elementos del almacén
        ArrayList<Electronico> elementos = almacen.getElementos();

        // Imprimir los elementos almacenados usando <? super T>
        almacen.imprimirElementos(elementos);

        // Imprimir los elementos almacenados como lista de productos
        ArrayList<Producto> listaProductos = new ArrayList<>(elementos);
        almacen.imprimirElementos(listaProductos);
    }
}
