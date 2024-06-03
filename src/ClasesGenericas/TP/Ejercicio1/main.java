package ArreglosGenericos.TP.Ejercicio1;

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Suma: " + calculadora.add(2,4));
        System.out.println("Resta: " + calculadora.subtract(6,3));
        System.out.println("Multiplicacion: " + calculadora.multiply(2,41));
        System.out.println("Divicion: " + calculadora.divide(230,32));
    }
}
