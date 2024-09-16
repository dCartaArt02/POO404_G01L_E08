package Calcular_Cambio;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalcularCambioGUI calculoCambioGUI = new CalcularCambioGUI();
            calculoCambioGUI.setVisible(true);
        });
    }
}

