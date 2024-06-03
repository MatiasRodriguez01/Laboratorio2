package PolimorfismoYDependencias.Herencia;

public class Main {
    public static void main(String[] args) {
        Leon l = new Leon();
        Vaca v = new Vaca();

        System.out.print("Leon: ");
        l.comer();
        System.out.print("Vaca: ");
        v.comer();
    }
}
