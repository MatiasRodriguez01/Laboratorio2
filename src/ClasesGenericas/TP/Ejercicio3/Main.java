package ArreglosGenericos.TP.Ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Almacen<Producto> almacen = new Almacen();

        almacen.agregarProducto(new Alimento("Dulce de leche", 3500.0));
        almacen.agregarProducto(new Alimento("Azucar", 900.0));
        almacen.agregarProducto(new Electronico("Celular", 90000.0));
        almacen.agregarProducto(new Electronico("Television", 700000.0));

        ArrayList<Alimento> alimentos = new ArrayList<>();
        alimentos.add(new Alimento("Arroz", 1200.21));
        alimentos.add(new Alimento("Gaseosa", 1700.21));
        alimentos.add(new Alimento("Queso", 700.21));

        ArrayList<Electronico> electronicos = new ArrayList<>();
        electronicos.add(new Electronico("Auriculares", 8000.21));
        electronicos.add(new Electronico("Cargador C", 4350.31));

        almacen.imprimirProductos();
        almacen.imprimirLista(alimentos);
        almacen.imprimirLista(electronicos);
    }
}
