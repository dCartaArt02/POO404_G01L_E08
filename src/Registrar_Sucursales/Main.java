package Registrar_Sucursales;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistroSucursalesGUI registroSucursalesGUI = new RegistroSucursalesGUI();
            registroSucursalesGUI.setVisible(true);
        });
    }
}