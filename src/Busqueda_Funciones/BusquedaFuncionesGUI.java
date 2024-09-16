package Busqueda_Funciones;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class BusquedaFuncionesGUI extends JFrame {
    private List<Sala> salas;
    private JTextField txtBusqueda;
    private JButton btnBuscarSucursal;
    private JButton btnBuscarPelicula;
    private JTextArea txtResultados;

    public BusquedaFuncionesGUI(List<Sala> salas) {
        this.salas = salas;
        initialize();
    }

    private void initialize() {
        setTitle("Búsqueda de Funciones");
        setSize(375, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel lblBusqueda = new JLabel("Buscar por Sucursal o Película:");
        txtBusqueda = new JTextField(20);
        btnBuscarSucursal = new JButton("Buscar Sucursal");
        btnBuscarPelicula = new JButton("Buscar Película");
        txtResultados = new JTextArea(10, 30);
        txtResultados.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(txtResultados);

        add(lblBusqueda);
        add(txtBusqueda);
        add(btnBuscarSucursal);
        add(btnBuscarPelicula);
        add(scrollPane);

        btnBuscarSucursal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sucursalBuscada = txtBusqueda.getText().trim();
                StringBuilder resultados = new StringBuilder();
                for (Sala sala : salas) {
                    if (sala.getSucursal().equalsIgnoreCase(sucursalBuscada)) {
                        resultados.append(sala).append("\n");
                    }
                }
                if (resultados.length() == 0) {
                    resultados.append("No se encontraron salas en la sucursal: ").append(sucursalBuscada);
                }
                txtResultados.setText(resultados.toString());
            }
        });

        btnBuscarPelicula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String peliculaBuscada = txtBusqueda.getText().trim();
                StringBuilder resultados = new StringBuilder();
                for (Sala sala : salas) {
                    if (sala.getPelicula().equalsIgnoreCase(peliculaBuscada)) {
                        resultados.append(sala).append("\n");
                    }
                }
                if (resultados.length() == 0) {
                    resultados.append("No se encontraron salas para la película: ").append(peliculaBuscada);
                }
                txtResultados.setText(resultados.toString());
            }
        });
    }
}