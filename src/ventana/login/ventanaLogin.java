package ventana.login;

import javax.swing.*;
import java.awt.*;

public class ventanaLogin  extends JFrame{
    private JPanel panel1;
    private JTextField txUsuario;
    private JPasswordField passwordField1;
    private JButton INGRESARButton;
    private JButton REGISTRARTEButton;
    private JButton SALIRButton;


    public ventanaLogin(){
        super("Login");

        setContentPane(panel1);
    }
}
