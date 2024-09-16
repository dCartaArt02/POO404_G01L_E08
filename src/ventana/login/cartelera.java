package ventana.login;

import javax.swing.*;

public class cartelera extends JFrame {


    private JPanel cartelerapnl;
    private JComboBox Opcionpeli;
    private JButton ButtoSelect;
    private JLabel peli1;
    private JLabel peli2;
    private JLabel peli3;
    private JLabel peli4;
    private JLabel peli5;
    private JLabel peli6;
    private JLabel peli7;
    private JLabel peli8;

    public cartelera() {
        this.setSize(1100, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(cartelerapnl);
        this.setTitle("Cartelera");
        this.setLocationRelativeTo(null);
        this.setVisible(true);



    }
    public static void main(String[] args) {
        new cartelera();
    }
}