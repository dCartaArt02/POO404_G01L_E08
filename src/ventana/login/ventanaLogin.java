package ventana.login;

import javax.swing.*;

public class ventanaLogin  extends JFrame{
    private JPanel LoginPanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton registrarseButton;
    private JButton ingresarButton;
    private JButton cancelarButton;


    public ventanaLogin(){
        super("Login");

        // Establecer el panel como el contenido de la ventana
        setContentPane(LoginPanel);

        // Configurar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null); // Centrar la ventana
        setVisible(true);

        // Agregar funcionalidad a los botones
        agregarAcciones();
    }

    private void agregarAcciones() {
        // Acción para el botón INGRESAR
        ingresarButton.addActionListener(e -> {
            String usuario = textField1.getText();
            String contraseña = new String(passwordField1.getPassword());

            // Aquí puedes agregar la lógica de autenticación
            if (usuario.equals("admin") && contraseña.equals("1234")) {
                JOptionPane.showMessageDialog(null, "¡Ingreso exitoso!");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
            }
        });
        // Acción para el botón REGISTRARSE
        registrarseButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Funcionalidad de registro no implementada.");
        });

        // Acción para el botón CANCELAR
        cancelarButton.addActionListener(e -> {
            System.exit(0); // Cerrar la aplicación
        });
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ventanaLogin());
    }
}
