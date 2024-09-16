import ventana.login.Clases.Conexion;
import ventana.login.Clases.ventanaLogin;

import javax.swing.*;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        final Connection conexion;

        try {
            conexion = Conexion.ConectarBD("primecinema");

            SwingUtilities.invokeLater(() -> {
                new ventanaLogin(conexion);
            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al establecer la conexión: " + e.getMessage());
            return;
        }

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                try {
                    if (conexion != null && !conexion.isClosed()) {
                        Conexion.Desconectar(conexion);
                    }
                } catch (Exception e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
                System.exit(0);
            }
        });
        frame.setVisible(true);
    }
}
