package Registrar_Sucursales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class RegistroSucursalesGUI extends JFrame {
    private List<Sucursal> sucursales;
    private JTextField txtNombre;
    private JTextField txtEncargado;
    private JTextField txtDireccion;
    private JTextField txtTelefono;

    public RegistroSucursalesGUI() {
        sucursales = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        setTitle("Registro de Sucursales");
        setSize(600, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(20);

        JLabel lblEncargado = new JLabel("Encargado:");
        txtEncargado = new JTextField(20);

        JLabel lblDireccion = new JLabel("Dirección:");
        txtDireccion = new JTextField(20);

        JLabel lblTelefono = new JLabel("Teléfono:");
        txtTelefono = new JTextField(10);

        JButton btnRegistrar = new JButton("Registrar Sucursal");
        JButton btnMostrarSucursales = new JButton("Mostrar Sucursales");
        JButton btnSalir = new JButton("Salir");

        add(lblNombre);
        add(txtNombre);
        add(lblEncargado);
        add(txtEncargado);
        add(lblDireccion);
        add(txtDireccion);
        add(lblTelefono);
        add(txtTelefono);
        add(btnRegistrar);
        add(btnMostrarSucursales);
        add(btnSalir);

        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = txtNombre.getText();
                String encargado = txtEncargado.getText();
                String direccion = txtDireccion.getText();
                String telefono = txtTelefono.getText();

                Sucursal nuevaSucursal = new Sucursal(nombre, encargado, direccion, telefono);
                sucursales.add(nuevaSucursal);
                JOptionPane.showMessageDialog(null, "Sucursal registrada:\n" + nuevaSucursal);

                txtNombre.setText("");
                txtEncargado.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
            }
        });

        btnMostrarSucursales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sucursales.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No hay sucursales registradas.");
                } else {
                    StringBuilder sb = new StringBuilder("Sucursales registradas:\n");
                    for (Sucursal sucursal : sucursales) {
                        sb.append(sucursal).append("\n");
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