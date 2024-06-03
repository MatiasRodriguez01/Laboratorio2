package PolimorfismoYDependencias.Sobrecarga;

public class TestSobreCarga {
    public static void main(String[] args) {

        SobreCarga sob = new SobreCarga();
        double resultado;

        sob.test();
        sob.test(1);
        sob.test(3,6);
        resultado = sob.test(123.23);
        System.out.println("Imprimiendo el metodo (sob.test(123.23)): " + resultado);
    }
}
