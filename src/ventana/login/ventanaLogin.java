package ventana.login;

import javax.swing.*;

public class ventanaLogin extends JFrame {
    private JPanel LoginPanel;
    private JTextField txUsuario;
    private JPasswordField pfContraseña;
    private JButton btnRegistrarse;
    private JButton btnIngresar;
    private JButton btnCancelar;

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

        btnIngresar.addActionListener(e -> {
            String usuario = txUsuario.getText();
            String contraseña = new String(pfContraseña.getPassword());


            if (usuario.equals("admin") && contraseña.equals("1234")) {
                JOptionPane.showMessageDialog(null, "¡Ingreso exitoso!");
            } else {
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
            }
        });

        btnRegistrarse.addActionListener(e -> {
            this.dispose();
            new Registracion1(this);
        });

        btnCancelar.addActionListener(e -> {
            System.exit(0); // Cerrar la aplicación
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ventanaLogin());
    }
}