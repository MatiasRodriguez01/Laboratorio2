package ArreglosGenericos.TP.Ejercicio4;
import java.util.ArrayList;
import java.util.List;

public class Almacen<T extends Producto> {
    private ArrayList<T> elementos;

    public Almacen() {
        this.elementos = new ArrayList<>();
    }

    public ArrayList<T> getElementos() {
        return elementos;
    }

    // Método para añadir elementos al almacén
    public void agregarElemento(T elemento) {
        elementos.add(elemento);
    }

    // Método para imprimir los elementos almacenados usando <? super T>
    public void imprimirElementos(ArrayList<? super T> lista) {
        for (Object elemento : lista) {
            System.out.println(elemento);
        }
    }
}
