package ventana.login.Clases;

public class Entrada {
    private int idEntrada;
    private int idSala;
    private int idPelicula;
    private double precio;
    private String asiento;
    private String estado;

    public Entrada(int idEntrada, int idSala, int idPelicula, double precio, String asiento, String estado) {
        this.idEntrada = idEntrada;
        this.idSala = idSala;
        this.idPelicula = idPelicula;
        this.precio = precio;
        this.asiento = asiento;
        this.estado = estado;
    }

    public int getIdEntrada() {
        return idEntrada;
    }

    public void setIdEntrada(int idEntrada) {
        this.idEntrada = idEntrada;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
