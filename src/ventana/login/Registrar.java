package ventana.login;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class Registrar extends JFrame {
    private static final HashMap<String, Usuario> usuariosRegistrados = new HashMap<>();
    private JTextField loginText, nombreText, duiText, direccionText, correoText, telefonoText;
    private JPasswordField passwordText;

    public Registrar() {
        setTitle("Registrar Usuario");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializeComponents();
        setVisible(true);
    }

    private void initializeComponents() {
        setLayout(new GridLayout(8, 2, 10, 10));

        loginText = new JTextField();
        passwordText = new JPasswordField();
        nombreText = new JTextField();
        duiText = new JTextField();
        direccionText = new JTextField();
        correoText = new JTextField();
        telefonoText = new JTextField();

        add(new JLabel("Log-in:"));
        add(loginText);
        add(new JLabel("Contraseña:"));
        add(passwordText);
        add(new JLabel("Nombre Completo:"));
        add(nombreText);
        add(new JLabel("DUI:"));
        add(duiText);
        add(new JLabel("Dirección:"));
        add(direccionText);
        add(new JLabel("Correo:"));
        add(correoText);
        add(new JLabel("Teléfono:"));
        add(telefonoText);

        JButton saveButton = new JButton("Guardar");
        saveButton.addActionListener(e -> registrarUsuario());
        add(saveButton);
    }

    private void registrarUsuario() {
        String login = loginText.getText();
        String password = new String(passwordText.getPassword());
        String nombre = nombreText.getText();
        String dui = duiText.getText();
        String direccion = direccionText.getText();
        String correo = correoText.getText();
        String telefono = telefonoText.getText();

        if (usuariosRegistrados.containsKey(login)) {
            JOptionPane.showMessageDialog(this, "El log-in ya está registrado. Elija otro.");
            return;
        }

        if (usuariosRegistrados.values().stream().anyMatch(u -> u.getDui().equals(dui))) {
            JOptionPane.showMessageDialog(this, "El DUI ya está registrado. Ingrese uno válido.");
            return;
        }

        Usuario nuevoUsuario = new Usuario(login, password, nombre, dui, direccion, correo, telefono);
        usuariosRegistrados.put(login, nuevoUsuario);
        JOptionPane.showMessageDialog(this, "Usuario registrado con éxito!");
        dispose();
    }

    public static HashMap<String, Usuario> getUsuariosRegistrados() {
        return usuariosRegistrados;
    }
}