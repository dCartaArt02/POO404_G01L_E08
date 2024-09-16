package ventana.login.Clases;

public class Usuario {
    private int idUsuario;
    private String login;
    private String contraseña;
    private String nombreCompleto; // Atributo nuevo
    private String DUI;
    private String direccion;
    private String correo;
    private String telefono;

    // Constructor modificado
    public Usuario(int idUsuario, String login, String contraseña, String nombreCompleto, String DUI, String direccion, String correo, String telefono) {
        this.idUsuario = idUsuario;
        this.login = login;
        this.contraseña = contraseña;
        this.nombreCompleto = nombreCompleto; // Asignar nombre completo
        this.DUI = DUI;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombreCompleto() { // Getter para nombre completo
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) { // Setter para nombre completo
        this.nombreCompleto = nombreCompleto;
    }

    public String getDUI() {
        return DUI;
    }

    public void setDUI(String DUI) {
        this.DUI = DUI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
