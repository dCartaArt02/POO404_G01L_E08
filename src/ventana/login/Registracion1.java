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
    private JPasswordField passwordField1;

    public Registracion1(JFrame parent) {
        setTitle("Registracion");
        setLocationRelativeTo(parent);
        setVisible(true);
        this.setSize(450, 400);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        this.setContentPane(registerPanel);
        this.setTitle("Registracion");
        this.setVisible(true);
    }
    public static void main(String[] args) {
        Registracion1 frm = new Registracion1(null);
    }

}
