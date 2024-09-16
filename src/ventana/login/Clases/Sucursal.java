package ventana.login.Clases;

public class Sucursal {
    private int idSucursal;
    private String nombre_sucursal; // Modificado de nombreSucursal a nombre_sucursal
    private String gerente;
    private String direccion;
    private String telefono;

    // Constructor
    public Sucursal(int idSucursal, String nombre_sucursal, String gerente, String direccion, String telefono) {
        this.idSucursal = idSucursal;
        this.nombre_sucursal = nombre_sucursal;
        this.gerente = gerente;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    // Getters y Setters
    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public String getNombre_sucursal() {
        return nombre_sucursal; // Modificado de getNombreSucursal a getNombre_sucursal
    }

    public void setNombre_sucursal(String nombre_sucursal) { // Modificado de setNombreSucursal a setNombre_sucursal
        this.nombre_sucursal = nombre_sucursal;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
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

}

