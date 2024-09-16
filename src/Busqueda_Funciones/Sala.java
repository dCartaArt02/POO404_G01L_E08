package Busqueda_Funciones;

class Sala {
    private int numeroSala;
    private String sucursal;
    private String pelicula;

    public Sala(int numeroSala, String sucursal, String pelicula) {
        this.numeroSala = numeroSala;
        this.sucursal = sucursal;
        this.pelicula = pelicula;
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getPelicula() {
        return pelicula;
    }

    @Override
    public String toString() {
        return "Sala " + numeroSala + " en " + sucursal + " - Película: " + pelicula;
    }
}