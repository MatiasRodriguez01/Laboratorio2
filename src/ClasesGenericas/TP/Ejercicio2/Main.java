package ArreglosGenericos.TP.Ejercicio2;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el tamaño de la pila: ");
        int tamanio = sc.nextInt();
        PilaArray pila = new PilaArray<Integer>(tamanio);

        while (true){
            try {
                System.out.println("---------------------");
                System.out.println("Menu:");
                System.out.println("1) añadir un elementos a la pila.");
                System.out.println("2) extraer un elementos de la pila.");
                System.out.println("3) mostrar el primer elemento de la pila.");
                System.out.println("4) mostrar la pila.");
                System.out.println("5) Salir.");
                System.out.print("opcio = ");
                int opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        try {
                            System.out.println("Ingrese el elemento que desea almacenar: ");
                            int elemento = sc.nextInt();
                            if (pila.añadir(elemento)) {
                                System.out.println("El elemento se añadio correctamente.");
                            } else {
                                System.out.println("NO SE PUDO ALMACENAR PORQUE LA PILA ESTA LLENA!!.");
                            }
                        } catch (Exception e) {
                            System.out.println("EL ELEMENTO ASIGNADO NO ES ACEPTADO!!!!");
                            sc.next();
                        }
                        continue;
                    case 2:
                        try {
                            System.out.println("Se extrajo el elemento " + pila.extraer() + " de la pila!!");
                        } catch (NoSuchElementException exception) {
                            System.out.println(exception.getMessage());
                            sc.next();
                        }
                        continue;
                    case 3:
                        try {
                            System.out.println("El primer elemento de la pila es: " + pila.primero());
                        } catch (NoSuchElementException exception) {
                            System.out.println(exception.getMessage());
                            sc.next();
                        }
                        continue;
                    case 4:
                        System.out.println(pila);
                        continue;
                    case 5:
                        System.out.println("HA SALIDO CORRECTAMENTE!!");
                        return;
                    default:
                        System.out.println("OPCION INCORRECTA!!");
                }
            } catch (InputMismatchException ie){
                System.out.println("No se ingreso un numero en el menu!!!");
                sc.next();
            }

        }


    }
}
