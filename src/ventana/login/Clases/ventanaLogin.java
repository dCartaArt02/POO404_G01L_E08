package ventana.login.Clases;

import javax.swing.*;
import java.sql.Connection;

public class ventanaLogin extends JFrame {
    private JPanel LoginPanel;
    private JTextField textField1;  // Campo para el login
    private JPasswordField passwordField1;  // Campo para la contraseña
    private JButton registrarseButton;
    private JButton ingresarButton;
    private JButton cancelarButton;

    // Variable para almacenar la conexión
    private Connection conexion;

    // Constructor que recibe la conexión a la base de datos
    public ventanaLogin(Connection conexion) {
        super("Login");

        // Asignar la conexión a la variable local
        this.conexion = conexion;

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
            String login = textField1.getText();
            String contraseña = new String(passwordField1.getPassword());

            // Validar el login contra la base de datos
            UsuarioDAO usuarioDAO = new UsuarioDAO();
            Usuario usuario = usuarioDAO.validarLogin(conexion, login, contraseña);

            if (usuario != null) {
                // Si el usuario es válido
                JOptionPane.showMessageDialog(null, "¡Ingreso exitoso! Bienvenido, " + usuario.getLogin());
                // Aquí podrías redirigir a la ventana principal de la aplicación
            } else {
                // Si el usuario o la contraseña no son válidos
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
            }
        });

        // Acción para el botón REGISTRARSE
        registrarseButton.addActionListener(e -> {
            // Abre la ventana de registro
            new Registracion1(this, conexion);
        });

        // Acción para el botón CANCELAR
        cancelarButton.addActionListener(e -> {
            System.exit(0); // Cerrar la aplicación
        });
    }

    public static void main(String[] args) {
        // Establecer la conexión a la base de datos
        Connection conexion = Conexion.ConectarBD("primecinema");

        // Crear y mostrar la ventana de login con la conexión
        SwingUtilities.invokeLater(() -> new ventanaLogin(conexion));
    }
}
