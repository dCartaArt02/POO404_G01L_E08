package ventana.login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaLogin extends JFrame {
    private JPanel LoginPanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton registrarseButton;
    private JButton ingresarButton;
    private JButton cancelarButton;

    public ventanaLogin() {
        super("Login");

        setContentPane(LoginPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);


        agregarAcciones();
    }

    private void agregarAcciones() {

        ingresarButton.addActionListener(e -> {
            String usuario = textField1.getText();
            String contraseña = new String(passwordField1.getPassword());


            if (usuario.equals("admin") && contraseña.equals("1234")) {
                JOptionPane.showMessageDialog(null, "¡Ingreso exitoso!");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
            }
        });

        registrarseButton.addActionListener(e -> {
            this.dispose();
            new Registracion1(this);
        });

        cancelarButton.addActionListener(e -> {
            System.exit(0); // Cerrar la aplicación
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ventanaLogin());
    }
}