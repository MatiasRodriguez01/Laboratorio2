package ArreglosGenericos.TP.Ejercicio2;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class PilaArray<E> {
    // Attributes
    private E[] array;
    private int contador;
    private int limite;

    // Constructor
    public PilaArray(int tamanio){
        this.array = (E[]) new Object[tamanio];
        this.contador = 0;
        this.limite = tamanio;
    }

    // metodos
    public boolean estaVacia(){
        return contador == 0;
    }

    public boolean añadir(E elemento){
        if (contador < limite){
            array[contador] = elemento;
            contador++;
            return true;
        } else {
            return false;
        }
    }

    public E primero(){
        if (estaVacia()){
            throw new NoSuchElementException("La pila esta vacia");
        }
        return array[contador-1];
    }

    public E extraer(){
        if (estaVacia()){
            throw new NoSuchElementException("La pila esta vacia");
        }
        contador--;
        return array[contador-1];
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < contador; i++) {
            sb.append(array[i]);
            if (i < contador - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
