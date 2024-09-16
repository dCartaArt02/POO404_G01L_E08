package Calcular_Cambio;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularCambioGUI extends JFrame {
    private JTextField txtTotalBoletas;
    private JTextField txtDineroEntregado;
    private JTextArea txtResultado;

    public CalcularCambioGUI() {
        initialize();
    }

    private void initialize() {
        setTitle("Calculadora de Cambio");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Etiquetas y campos de entrada
        JLabel lblTotalBoletas = new JLabel("Valor Total de Boletas:");
        txtTotalBoletas = new JTextField(15);

        JLabel lblDineroEntregado = new JLabel("Dinero Entregado:");
        txtDineroEntregado = new JTextField(15);

        JButton btnCalcularCambio = new JButton("Calcular Cambio");
        txtResultado = new JTextArea(5, 30);
        txtResultado.setEditable(false);
        txtResultado.setLineWrap(true);
        txtResultado.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(txtResultado);

        // Configurar el diseño
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 5, 10);
        add(lblTotalBoletas, gbc);

        gbc.gridx = 1;
        add(txtTotalBoletas, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(lblDineroEntregado, gbc);

        gbc.gridx = 1;
        add(txtDineroEntregado, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        add(btnCalcularCambio, gbc);

        gbc.gridy = 3;
        add(scrollPane, gbc);

        btnCalcularCambio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularCambio();
            }
        });
    }

    private void calcularCambio() {
        try {
            double totalBoletas = Double.parseDouble(txtTotalBoletas.getText());
            double dineroEntregado = Double.parseDouble(txtDineroEntregado.getText());

            if (dineroEntregado < totalBoletas) {
                txtResultado.setText("El dinero entregado es insuficiente.");
            } else {
                double cambio = dineroEntregado - totalBoletas;
                txtResultado.setText(String.format("El cambio a entregar es: $%.2f", cambio));
            }
        } catch (NumberFormatException e) {
            txtResultado.setText("Por favor, ingrese valores numéricos válidos.");
        }
    }
}
