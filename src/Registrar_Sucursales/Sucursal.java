package Registrar_Sucursales;

class Sucursal {
    private String nombre;
    private String encargado;
    private String direccion;
    private String telefono;

    public Sucursal(String nombre, String encargado, String direccion, String telefono) {
        this.nombre = nombre;
        this.encargado = encargado;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Encargado: " + encargado + ", Dirección: " + direccion + ", Teléfono: " + telefono;
    }
}