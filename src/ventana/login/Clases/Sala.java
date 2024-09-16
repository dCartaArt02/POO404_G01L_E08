package ventana.login.Clases;

public class Sala {

    private int idSala;
    private int numeroSala;
    private int idSucursal;
    private int idPelicula;
    private String horario;

    public Sala(int idSala, int numeroSala, int idSucursal, int idPelicula, String horario) {
        this.idSala = idSala;
        this.numeroSala = numeroSala;
        this.idSucursal = idSucursal;
        this.idPelicula = idPelicula;
        this.horario = horario;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getIdSucursal() {
        return idSucursal;
    }

    public void setIdSucursal(int idSucursal) {
        this.idSucursal = idSucursal;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
}
