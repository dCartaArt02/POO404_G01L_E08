package Registrar_Compra;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroEntradasGUI extends JFrame {
    private JButton[][] butacas;
    private static final int FILAS = 8;
    private static final int COLUMNAS = 5;
    private boolean[][] estadoButacas;

    public RegistroEntradasGUI() {
        estadoButacas = new boolean[FILAS][COLUMNAS];
        initialize();
    }

    private void initialize() {
        setTitle("Registro de Entradas");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelButacas = new JPanel();
        panelButacas.setLayout(new GridLayout(FILAS, COLUMNAS));
        butacas = new JButton[FILAS][COLUMNAS];

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                butacas[i][j] = new JButton("Silla " + (i + 1) + "-" + (j + 1));
                butacas[i][j].setBackground(Color.GREEN);
                butacas[i][j].addActionListener(new ButacaActionListener(i, j));
                panelButacas.add(butacas[i][j]);
            }
        }

        JButton btnResetear = new JButton("Desocupar Butacas");
        btnResetear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetearButacas();
            }
        });

        add(panelButacas, BorderLayout.CENTER);
        add(btnResetear, BorderLayout.SOUTH);
    }

    private void resetearButacas() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                estadoButacas[i][j] = false;
                butacas[i][j].setBackground(Color.GREEN);
            }
        }
        JOptionPane.showMessageDialog(this, "Todas las butacas han sido desocupadas.");
    }

    private class ButacaActionListener implements ActionListener {
        private int fila;
        private int columna;

        public ButacaActionListener(int fila, int columna) {
            this.fila = fila;
            this.columna = columna;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (!estadoButacas[fila][columna]) {
                estadoButacas[fila][columna] = true;
                butacas[fila][columna].setBackground(Color.RED);
                JOptionPane.showMessageDialog(null, "Butaca " + (fila + 1) + "-" + (columna + 1) + " ocupada.");
            } else {
                JOptionPane.showMessageDialog(null, "La butaca " + (fila + 1) + "-" + (columna + 1) + " ya está ocupada.");
            }
        }
    }
}
