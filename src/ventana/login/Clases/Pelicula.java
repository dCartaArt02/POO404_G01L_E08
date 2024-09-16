package ventana.login.Clases;

public class Pelicula {
    private int idPelicula;
    private String nombre;
    private String genero;
    private String clasificacion;
    private String formato;
    private double valorTradicionalAdulto;
    private double valorTradicionalTerceraEdad;
    private double valor3DAdulto;
    private double valor3DTerceraEdad;

    public Pelicula(int idPelicula, String nombre, String genero, String clasificacion, String formato, double valorTradicionalAdulto, double valorTradicionalTerceraEdad, double valor3DAdulto, double valor3DTerceraEdad) {
        this.idPelicula = idPelicula;
        this.nombre = nombre;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.formato = formato;
        this.valorTradicionalAdulto = valorTradicionalAdulto;
        this.valorTradicionalTerceraEdad = valorTradicionalTerceraEdad;
        this.valor3DAdulto = valor3DAdulto;
        this.valor3DTerceraEdad = valor3DTerceraEdad;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public double getValorTradicionalAdulto() {
        return valorTradicionalAdulto;
    }

    public void setValorTradicionalAdulto(double valorTradicionalAdulto) {
        this.valorTradicionalAdulto = valorTradicionalAdulto;
    }

    public double getValorTradicionalTerceraEdad() {
        return valorTradicionalTerceraEdad;
    }

    public void setValorTradicionalTerceraEdad(double valorTradicionalTerceraEdad) {
        this.valorTradicionalTerceraEdad = valorTradicionalTerceraEdad;
    }

    public double getValor3DAdulto() {
        return valor3DAdulto;
    }

    public void setValor3DAdulto(double valor3DAdulto) {
        this.valor3DAdulto = valor3DAdulto;
    }

    public double getValor3DTerceraEdad() {
        return valor3DTerceraEdad;
    }

    public void setValor3DTerceraEdad(double valor3DTerceraEdad) {
        this.valor3DTerceraEdad = valor3DTerceraEdad;
    }
}
