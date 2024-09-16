package Registrar_Sucursales;

import javax.swing.*;

public class MainRegistrarSucursal extends JFrame {

    public MainRegistrarSucursal() {
        // Configurar la ventana de registro de sucursales
        setTitle("Registro de Sucursales");
        setSize(800, 600); // Establece el tamaño de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla

        // Puedes agregar aquí los elementos gráficos (formulario) para registrar la sucursal

        setVisible(true); // Asegúrate de que la ventana sea visible
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainRegistrarSucursal();
        });
    }
}
