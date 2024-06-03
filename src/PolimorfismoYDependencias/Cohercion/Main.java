package PolimorfismoYDependencias.Cohercion;

public class Main {
    public static void main(String[] args) {

        int a = 3, b = 5;
        double suma;

        // Creo una clase Suma y llamo el metodo sumar, y le asigno 2 variables enteras
        Suma sum = new Suma();
        System.out.println("La suma de " + a + " y " + b + " es " + sum.sumar(a, b));

        // Hago la misma suma, pero hago una conversiona de tipo double cuando sumo las 2 variable enteras.
        suma = (double) a + b;
        System.out.println("La misma suma pero en una variable double: " + suma);
    }
}
