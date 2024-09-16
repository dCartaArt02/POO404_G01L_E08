package Clases;

public class Ventas {

    private int idVenta;
    private int idSala;
    private int cantidadEntradasTradicionalAdulto;
    private int cantidadEntradasTradicionalTercera;
    private int cantidadEntradas3DAdulto;
    private int cantidadEntradas3DTercera;
    private double total;

    public Ventas(int idVenta, int idSala, int cantidadEntradasTradicionalAdulto, int cantidadEntradasTradicionalTercera, int cantidadEntradas3DAdulto, int cantidadEntradas3DTercera, double total) {
        this.idVenta = idVenta;
        this.idSala = idSala;
        this.cantidadEntradasTradicionalAdulto = cantidadEntradasTradicionalAdulto;
        this.cantidadEntradasTradicionalTercera = cantidadEntradasTradicionalTercera;
        this.cantidadEntradas3DAdulto = cantidadEntradas3DAdulto;
        this.cantidadEntradas3DTercera = cantidadEntradas3DTercera;
        this.total = total;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdSala() {
        return idSala;
    }

    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }

    public int getCantidadEntradasTradicionalAdulto() {
        return cantidadEntradasTradicionalAdulto;
    }

    public void setCantidadEntradasTradicionalAdulto(int cantidadEntradasTradicionalAdulto) {
        this.cantidadEntradasTradicionalAdulto = cantidadEntradasTradicionalAdulto;
    }

    public int getCantidadEntradasTradicionalTercera() {
        return cantidadEntradasTradicionalTercera;
    }

    public void setCantidadEntradasTradicionalTercera(int cantidadEntradasTradicionalTercera) {
        this.cantidadEntradasTradicionalTercera = cantidadEntradasTradicionalTercera;
    }

    public int getCantidadEntradas3DAdulto() {
        return cantidadEntradas3DAdulto;
    }

    public void setCantidadEntradas3DAdulto(int cantidadEntradas3DAdulto) {
        this.cantidadEntradas3DAdulto = cantidadEntradas3DAdulto;
    }

    public int getCantidadEntradas3DTercera() {
        return cantidadEntradas3DTercera;
    }

    public void setCantidadEntradas3DTercera(int cantidadEntradas3DTercera) {
        this.cantidadEntradas3DTercera = cantidadEntradas3DTercera;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
