package agregacionEjemplo;
import java.util.*;
public class Agenda {
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private int numClientes;


    public Agenda(int numClientes){
        this.numClientes = numClientes;
    }


    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public int getNumClientes() {
        return numClientes;
    }

    public void setNumClientes(int numClientes) {
        this.numClientes = numClientes;
    }

    public void agregarClientes(Cliente cliente){
        clientes.add(cliente);
    }

    public void buscar(Scanner sc){
        System.out.print("Ingrese el nombre del cliente que desea buscar: ");
        String nombre = sc.nextLine();
        boolean encontrado = false;

        for (Cliente c : clientes){
            if (c.getNombre().equalsIgnoreCase(nombre)){
                c.informacion();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) { System.out.println("No se encontró el cliente que está buscando!!"); }
    }

    public void mostrar(){
        for (Cliente c : clientes){
            c.informacion();
            System.out.println(" ");
        }
    }

}
