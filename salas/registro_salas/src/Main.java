import javax.swing.*;



public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RegistroSalasGUI registroSalasGUI = new RegistroSalasGUI();
            registroSalasGUI.setVisible(true);
        });
    }
}