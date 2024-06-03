package Martes_21_marzo;

public class Main_e1 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Pepito", 14, EstadoCivil.SOLTERO);
        Persona p0 = new Persona("Maria", 42, EstadoCivil.VIUDO);

        p0.agregarHijos(p1);
        p1.agregarPadre(p0);

        System.out.println("Yo soy " + p0.getNombre() + " y mi hijo es " + p0.getHijos().get(0).getNombre());
        System.out.println("Yo soy " + p1.getNombre() + " y mi madre es " + p1.getPadre()[0].getNombre());
    }
}
