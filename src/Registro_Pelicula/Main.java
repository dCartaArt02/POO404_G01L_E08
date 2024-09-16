package Registro_Pelicula;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Registro de Película");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Espaciado

        // Crear campos de entrada
        JTextField nombreField = new JTextField(20);
        JTextField generoField = new JTextField(20);
        JTextField clasificacionField = new JTextField(20);
        JTextField formatoField = new JTextField(20);
        JTextField tipoEdadField = new JTextField(20);

        // Añadir etiquetas y campos de texto
        gbc.gridx = 0; gbc.gridy = 0; frame.add(new JLabel("Nombre:"), gbc);
        gbc.gridx = 1; frame.add(nombreField, gbc);

        gbc.gridx = 0; gbc.gridy = 1; frame.add(new JLabel("Género:"), gbc);
        gbc.gridx = 1; frame.add(generoField, gbc);

        gbc.gridx = 0; gbc.gridy = 2; frame.add(new JLabel("Clasificación:"), gbc);
        gbc.gridx = 1; frame.add(clasificacionField, gbc);

        gbc.gridx = 0; gbc.gridy = 3; frame.add(new JLabel("Formato (Tradicional o 3D):"), gbc);
        gbc.gridx = 1; frame.add(formatoField, gbc);

        gbc.gridx = 0; gbc.gridy = 4;  frame.add(new JLabel("Tipo de Edad (tercera edad o adulto):"), gbc);
        gbc.gridx = 1; frame.add(tipoEdadField, gbc);

        // Botón para registrar la película
        JButton registrarButton = new JButton("Registrar Película");
        gbc.gridx = 0; gbc.gridy = 5; gbc.gridwidth = 2; // Ocupa dos columnas
        frame.add(registrarButton, gbc);

        // Acción del botón
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    registroPelicula pelicula = new registroPelicula(
                            nombreField.getText(),
                            generoField.getText(),
                            clasificacionField.getText(),
                            formatoField.getText(),
                            tipoEdadField.getText()
                    );
                    pelicula.mostrarInformacion();
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        // Configurar el marco
        frame.setVisible(true);
    }
}

