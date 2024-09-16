class Sala {
    private int numeroSala;
    private String sucursal;
    private String pelicula;
    private String[] horarios;

    public Sala(int numeroSala, String sucursal, String pelicula, String[] horarios) {
        this.numeroSala = numeroSala;
        this.sucursal = sucursal;
        this.pelicula = pelicula;
        this.horarios = horarios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Sala número: ").append(numeroSala)
                .append(", Sucursal: ").append(sucursal)
                .append(", Película: ").append(pelicula)
                .append(", Horarios: ");
        for (String horario : horarios) {
            sb.append(horario).append(" ");
        }
        return sb.toString();
    }
}