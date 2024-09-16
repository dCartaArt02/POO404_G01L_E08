package Registro_Pelicula;

import javax.swing.*;

public class registroPelicula {
    private String nombre;
    private String genero;
    private String clasificacion;
    private String formato;
    private double valorFuncion;

    public registroPelicula(String nombre, String genero, String clasificacion, String formato, String tipoEdad) {
        this.nombre = nombre;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.formato = formato;
        calcularValorFuncion(tipoEdad);
    }

    private void calcularValorFuncion(String tipoEdad) {
        if (formato.equalsIgnoreCase("tradicional")) {
            if (tipoEdad.equalsIgnoreCase("tercera edad")) {
                valorFuncion = 3.90;
            } else if (tipoEdad.equalsIgnoreCase("adulto")) {
                valorFuncion = 5.00;
            } else {
                throw new IllegalArgumentException("Tipo de edad no válido. Debe ser 'tercera edad' o 'adulto'.");
            }
        } else if (formato.equalsIgnoreCase("3d")) {
            if (tipoEdad.equalsIgnoreCase("tercera edad")) {
                valorFuncion = 5.60;
            } else if (tipoEdad.equalsIgnoreCase("adulto")) {
                valorFuncion = 6.55;
            } else {
                throw new IllegalArgumentException("Tipo de edad no válido. Debe ser 'tercera edad' o 'adulto'.");
            }
        } else {
            throw new IllegalArgumentException("Formato no válido. Debe ser 'Tradicional' o '3D'.");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getFormato() {
        return formato;
    }

    public double getValorFuncion() {
        return valorFuncion;
    }

    public void mostrarInformacion() {
        String mensaje = "Nombre: " + getNombre() +
                "\nGénero: " + getGenero() +
                "\nClasificación: " + getClasificacion() +
                "\nFormato: " + getFormato() +
                "\nValor de función: $" + getValorFuncion();
        JOptionPane.showMessageDialog(null, mensaje, "Información de la Película", JOptionPane.INFORMATION_MESSAGE);
    }
}
