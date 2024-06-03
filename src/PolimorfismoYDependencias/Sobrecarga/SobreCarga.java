package PolimorfismoYDependencias.Sobrecarga;

public class SobreCarga {
    // Metodo test para imprimir un mensaje
    void test(){
        System.out.println("No parametros");
    }

    // El mismo metodo, pero recibe una variable
    void test(int a){
        System.out.println("Parametro a: " + a);
    }

    // El mismo metodo, pero recibe 2 variable
    void test(int a ,int b){
        System.out.println("Parametro a: " + a + ", y b: " + b);
    }

    // El mismo metodo pero recibe una variable y devuelve un resultado
    double test(double a){
        System.out.println("Double de a:");
        return a * a;
    }
}
