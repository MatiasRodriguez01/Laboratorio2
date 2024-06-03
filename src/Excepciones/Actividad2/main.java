package Excepciones.Actividad2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Nombre de la persona: ");
            String n = sc.next();
            System.out.print("Dni de la persona: ");
            int d = sc.nextInt();
            Persona p = new Persona(n, d);
            System.out.println(p);

        } catch (InputMismatchException e) {
            System.out.println("Error: El dni no contiene numeros!");
        }
    }
}
