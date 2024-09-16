package Clases;

public class Usuario {
    private int idUsuario;
    private String login;
    private String contraseña;
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String DUI;
    private String direccion;
    private String correo;
    private String telefono;

    // Constructor
    public Usuario(int idUsuario, String login, String contraseña, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String DUI, String direccion, String correo, String telefono) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.contraseña = contraseña;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.DUI = DUI;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }


}
