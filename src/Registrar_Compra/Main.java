package Registrar_Compra;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistroEntradasGUI registroEntradasGUI = new RegistroEntradasGUI();
            registroEntradasGUI.setVisible(true);
        });
    }
}

