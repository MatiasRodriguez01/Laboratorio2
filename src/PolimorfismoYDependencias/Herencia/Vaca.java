package PolimorfismoYDependencias.Herencia;

public class Vaca extends Animal{
    @Override
    void comer() {
        System.out.println("Yo como pasto");
    }
}
