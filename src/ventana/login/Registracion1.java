package ventana.login;

import javax.swing.*;

public class Registracion1 extends JDialog {
    private JPanel registerPanel;
    private JTextField tfUsuario;
    private JTextField tfTelefono;
    private JTextField tfCorreo;
    private JTextField tfDireccion;
    private JTextField tfNombre;
    private JTextField tfDui;
    private JButton btnRegistrarse;
    private JButton btnCancelar;
    private JPasswordField pfContraseña;

    public Registracion1(JFrame parent) {
        super(parent, "Registro", true);
        setContentPane(registerPanel);
        setSize(500, 500);
        setLocationRelativeTo(parent);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);


        btnRegistrarse.addActionListener(e -> {

            parent.setVisible(true);
            dispose();
        });


        btnCancelar.addActionListener(e -> {
            parent.setVisible(true);
            dispose();
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Registracion1(null);
    }
}