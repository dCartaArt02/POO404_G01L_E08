package ventana.login.Clases;

public class Butaca {
    private int idButaca;
    private int idSala;
    private int fila;
    private int columna;
    private String estado;

    public Butaca(int idButaca, int idSala, int fila, int columna, String estado) {
        this.idButaca = idButaca;
        this.idSala = idSala;
        this.fila = fila;
        this.columna = columna;
        this.estado = estado;
    }

    public int getIdButaca() {
        return idButaca;
    }

    public void setIdButaca(int idButaca) {
        this.idButaca = idButaca;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
