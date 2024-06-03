package ArreglosGenericos.TP.Ejercicio1;

public class Calculadora implements Operable<Integer>{
    public Calculadora(){};

    @Override
    public Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer subtract(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        return num1 / num2;
    }


}
