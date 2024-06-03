package agregacionEjemplo;

import java.util.*;

public class Empresa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda(5);

        agenda.agregarClientes(new Cliente("43", "Mateo", "Guaymallen", "32465564"));
        agenda.agregarClientes(new Cliente("422", "Maxi", "Las heras", "34243464"));

        while (true){
            System.out.println("menu: ");
            System.out.println("1 - agregar cliente.");
            System.out.println("2 - buscar cliente.");
            System.out.println("3 - mostrar clientes.");
            System.out.println("4 - salir");
            System.out.println("opcion = ");
            int opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    agregamos(agenda, sc);
                case 2:
                    agenda.buscar(sc);
                case 3:
                    agenda.mostrar();
                case 4:
                    break;
                default:
                    System.out.println("Opcion incorrecta!!");
            }
            System.out.println("----------------");
        }
    }

    public static void agregamos(Agenda agenda, Scanner sc) {
        if (agenda.getClientes().size() == agenda.getNumClientes()) {
            System.out.println("La agenda está llena!!");
        } else {
                System.out.print("Ingrese el número del cliente: ");
                String numCliente = sc.nextLine(); // Cambiado a nextLine para evitar problemas con la entrada

                System.out.print("Ingrese el nombre del cliente: ");
                String nombre = sc.nextLine(); // Cambiado a nextLine para evitar problemas con la entrada

                System.out.print("Ingrese la dirección del cliente: ");
                String direccion = sc.nextLine();

                System.out.print("Ingrese el teléfono del cliente: ");
                String telefono = sc.nextLine();

                // Agregar nuevo cliente a la agenda
                agenda.agregarClientes(new Cliente(numCliente, nombre, direccion, telefono));
        }
    }
}
