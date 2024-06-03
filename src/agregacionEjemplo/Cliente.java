package agregacionEjemplo;

public class Cliente {
    private String numCliente;
    private String nombre;
    private String direccion;
    private String telefono;


    public Cliente() {
    }

    public Cliente(String numCliente, String nombre, String direccion, String telefono) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNumCliente() {
        return numCliente;
    }

    public void setNumCliente(String numCliente) {
        this.numCliente = numCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void informacion(){
        System.out.println("Cliente N° " + numCliente + ": ");
        System.out.println(" - nombre: " + nombre);
        System.out.println(" - Direccion: " + direccion);
        System.out.println(" - Telefono: " + telefono);
    }
}
