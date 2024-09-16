package base;

import ventana.login.Clases.Conexion;
import ventana.login.Clases.ventanaLogin;
import ventana.login.cartelera;

import javax.swing.*;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conexion;
        try {
            conexion = Conexion.ConectarBD("primecinema");

            SwingUtilities.invokeLater(() -> {
                ventanaLogin loginWindow = new ventanaLogin(conexion);
                loginWindow.setVisible(true); // Mostrar la ventana de login
            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al establecer la conexión: " + e.getMessage());
            return;
        }


    }
    public static void abrirCartelera() {
        // Método para abrir la ventana Inicio después de un ingreso exitoso
        SwingUtilities.invokeLater(() -> new cartelera());
    }

    public static void Main(String[] args) {

    }
}
