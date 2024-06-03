package Excepciones;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dividamos:");
        try {
            System.out.print("* Numerador -> ");
            int num1 = sc.nextInt();
            System.out.print("* Denominador -> ");
            int num2 = sc.nextInt();
            if (num2 == 0){
                throw new ArithmeticException("El denominador es 0.");
            } else if (num1 % num2 != 0) {
                throw new IllegalArgumentException("La division no es exacta.");
            } else {
                int resultado = (num1 / num2);
                System.out.println("Resultado = " + resultado);
            }
        } catch (ArithmeticException | IllegalArgumentException ae){
            System.out.println("Error: " + ae.getMessage());
        } catch (Exception e){
            System.out.println("Otro error: " + e.getMessage());
        }
    }
}
