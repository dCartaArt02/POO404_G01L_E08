package ventana.login;

import javax.swing.*;
import java.awt.*;

public class Login {
    private JFrame frame;
    private JTextField userText;
    private JPasswordField passwordText;

    public Login() {
        frame = new JFrame("Demo Application");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initializeComponents();
        frame.setVisible(true);
    }

    private void initializeComponents() {
        frame.setLayout(new GridLayout(4, 2, 10, 10));

        frame.add(new JLabel("User:"));
        userText = new JTextField();
        frame.add(userText);

        frame.add(new JLabel("Password:"));
        passwordText = new JPasswordField();
        frame.add(passwordText);

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(e -> handleLogin());
        frame.add(loginButton);

        JButton registerButton = new JButton("Register");
        registerButton.addActionListener(e -> new Registrar());
        frame.add(registerButton);
    }

    private void handleLogin() {
        String enteredUser = userText.getText();
        String enteredPassword = new String(passwordText.getPassword());
        Usuario usuario = Registrar.getUsuariosRegistrados().get(enteredUser);

        if (usuario != null && usuario.getPassword().equals(enteredPassword)) {
            JOptionPane.showMessageDialog(frame, "Login successful!");
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}