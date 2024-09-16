package Calcular_Cambio;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcularCambioGUI extends JFrame {
    private JTextField txtTotalBoletas;
    private JTextField txtDineroEntregado;
    private JTextArea txtResultado;
    private JPanel pnlcalcular;
    private JLabel calculadoraicono;
    private JTextField lblboletas;
    private JTextField lblentregado;
    private JButton btncambio;
    private JLabel titulo1;
    private JLabel titulo2;
    private JTextArea txtresultado;

    public CalcularCambioGUI() {
        initialize();
    }

    private void initialize() {
        setTitle("Calculadora de Cambio");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(pnlcalcular);

        setVisible(true);



        // Etiquetas y campos de entrada




        btncambio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularCambio();
            }
        });
    }

    private void calcularCambio() {
        try {
            double totalBoletas = Double.parseDouble(lblboletas.getText());
            double dineroEntregado = Double.parseDouble(lblentregado.getText());

            if (dineroEntregado < totalBoletas) {
                txtResultado.setText("El dinero entregado es insuficiente.");
            } else {
                double cambio = dineroEntregado - totalBoletas;
                txtresultado.setText(String.format("El cambio a entregar es: $%.2f", cambio));
            }
        } catch (NumberFormatException e) {
            txtresultado.setText("Por favor, ingrese valores numéricos válidos.");
        }
    }
    public static void main(String[] args) {
        new CalcularCambioGUI();
    }
}
