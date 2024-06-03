package Excepciones.TP;
import java.util.Scanner;

public class Ejercicio1 {

    public void sumar(){


        int number1 = 1;
        int number2 = 2;

        System.out.println(number1 + number2);
        System.out.println();
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        try {
            String aux = "hola";
            int aux2 = Integer.parseInt(aux);
            System.out.println(aux2);
        } catch(NumberFormatException n){
            System.out.println("Error: " + n.getMessage());
        }
    }

}
