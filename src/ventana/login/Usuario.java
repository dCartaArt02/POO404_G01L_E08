package ventana.login;

public class Usuario {
    private String login;
    private String password;
    private String nombre;
    private String dui;
    private String direccion;
    private String correo;
    private String telefono;

    public Usuario(String login, String password, String nombre, String dui, String direccion, String correo, String telefono) {
        this.login = login;
        this.password = password;
        this.nombre = nombre;
        this.dui = dui;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getPassword() {
        return password;
    }

    public String getDui() {
        return dui;
    }
}