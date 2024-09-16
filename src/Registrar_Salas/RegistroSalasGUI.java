package Registrar_Salas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class RegistroSalasGUI extends JFrame {
    private List<Sala> salas;
    private JTextField txtSucursal;
    private JTextField txtNumeroSala;
    private JTextField txtPelicula;
    private JTextField txtHorario;
    private DefaultListModel<String> horariosModel;
    private JList<String> horariosList;

    public RegistroSalasGUI() {
        salas = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        setTitle("Registro de Salas");
        setSize(430, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel lblSucursal = new JLabel("Sucursal:");
        txtSucursal = new JTextField(15);

        JLabel lblNumeroSala = new JLabel("Número de Sala: ");
        txtNumeroSala = new JTextField(5);

        JLabel lblPelicula = new JLabel("Película:");
        txtPelicula = new JTextField(15);

        JLabel lblHorario = new JLabel("Horario:");
        txtHorario = new JTextField(10);

        JButton btnAgregarHorario = new JButton("Agregar Horario");
        JButton btnRegistrar = new JButton("Registrar Sala");
        JButton btnMostrarSalas = new JButton("Mostrar Salas");
        JButton btnSalir = new JButton("Salir");

        horariosModel = new DefaultListModel<>();
        horariosList = new JList<>(horariosModel);
        JScrollPane scrollPane = new JScrollPane(horariosList);
        scrollPane.setPreferredSize(new Dimension(300, 200));

        add(lblSucursal);
        add(txtSucursal);
        add(lblNumeroSala);
        add(txtNumeroSala);
        add(lblPelicula);
        add(txtPelicula);
        add(lblHorario);
        add(txtHorario);
        add(btnAgregarHorario);
        add(scrollPane);
        add(btnRegistrar);
        add(btnMostrarSalas);
        add(btnSalir);

        btnAgregarHorario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String horario = txtHorario.getText();
                if (!horario.isEmpty()) {
                    horariosModel.addElement(horario);
                    txtHorario.setText(""); // Limpiar el campo de horario
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un horario.");
                }
            }
        });

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sucursal = txtSucursal.getText();
                int numeroSala = Integer.parseInt(txtNumeroSala.getText());
                String pelicula = txtPelicula.getText();
                String[] horarios = new String[horariosModel.size()];
                for (int i = 0; i < horariosModel.size(); i++) {
                    horarios[i] = horariosModel.getElementAt(i);
                }

                Registrar_Salas.Sala nuevaSala = new Registrar_Salas.Sala(numeroSala, sucursal, pelicula, horarios);
                salas.add(nuevaSala);
                JOptionPane.showMessageDialog(null, "Sala registrada:\n" + nuevaSala);

                txtSucursal.setText("");
                txtNumeroSala.setText("");
                txtPelicula.setText("");
                horariosModel.clear();
            }
        });


        btnMostrarSalas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (salas.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay salas registradas.");
                } else {
                    StringBuilder sb = new StringBuilder("Salas registradas:\n");
                    for (Registrar_Salas.Sala sala : salas) {
                        sb.append(sala).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                }
            }
        });

        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
