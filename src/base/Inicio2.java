package base;

import javax.swing.*;

public class Inicio2 extends JFrame {
    public Inicio2() {
        super("Inicio");

        // Configuración de la ventana de Inicio
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Centrar la ventana

        // Puedes agregar componentes aquí
        JLabel label = new JLabel("Bienvenido a la aplicación!");
        add(label);

        setVisible(true); // Hacer visible la ventana
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Inicio2());
    }
}

