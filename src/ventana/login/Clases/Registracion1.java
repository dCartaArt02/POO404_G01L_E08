package ventana.login.Clases;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;

public class Registracion1 extends JDialog {
    private JPanel registerPanel;
    private JTextField tfLogin;
    private JTextField tfTelefono;
    private JTextField tfCorreo;
    private JTextField tfDireccion;
    private JTextField tfNombreCompleto;
    private JTextField tfDui;
    private JButton btnRegistrarse;
    private JButton btnCancelar;
    private JPasswordField pfContraseña;

    private Connection conexion;

    public Registracion1(JFrame parent, Connection conexion) {
        super(parent, "Registración", true);
        this.conexion = conexion;
        setContentPane(registerPanel);
        setLocationRelativeTo(parent);
        setSize(500, 500);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        btnRegistrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear un nuevo usuario
                Usuario usuario = new Usuario(
                        0, // ID se genera automáticamente en la base de datos
                        tfLogin.getText(),
                        new String(pfContraseña.getPassword()),
                        tfNombreCompleto.getText(),
                        tfDui.getText(),
                        tfDireccion.getText(),
                        tfCorreo.getText(),
                        tfTelefono.getText()
                );


                // Registrar el usuario
                UsuarioDAO usuarioDAO = new UsuarioDAO();


                if (usuarioDAO.registrarUsuario(conexion, usuario)) {

                    JOptionPane.showMessageDialog(null, "¡Dui repetido!");
                    dispose(); // Cerrar el diálogo
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar el usuario.");
                }
            }
        });

        // Acción para el botón CANCELAR
        btnCancelar.addActionListener(e -> dispose());

        setVisible(true);
    }

    public static void main(String[] args) {
        // Establecer la conexión a la base de datos
        Connection conexion = Conexion.ConectarBD("primecinema");
        Registracion1 frm = new Registracion1(null, conexion);
    }
}
