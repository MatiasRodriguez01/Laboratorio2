package ArreglosGenericos.TP.Ejercicio1;

public interface Operable<T> {
    T add(T num1, T num2);
    T subtract(T num1, T num2);
    T multiply(T num1, T num2);
    T divide(T num1, T num2);
}
