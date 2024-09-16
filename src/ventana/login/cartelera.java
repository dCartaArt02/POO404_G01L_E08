package ventana.login;

import javax.swing.*;
import Registrar_Sucursales.RegistroSucursalesGUI; // Asegúrate de que la clase sea correcta
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ventana.login.Clases.Conexion;
import java.sql.Connection;

public class cartelera extends JFrame {

    private JPanel cartelerapnl;
    private JComboBox<String> Opcionpeli;
    private JLabel peli1;
    private JLabel peli2;
    private JLabel peli3;
    private JLabel peli4;
    private JLabel peli5;
    private JLabel peli6;
    private JLabel peli7;
    private JLabel peli8;
    private JButton ingresarButton;
    private JButton registarSucursalButton;
    private Connection conexion; // Atributo para la conexión

    public cartelera() {
        // Conectar a la base de datos
        conexion = Conexion.ConectarBD("primecinema"); // Establecer la conexión

        // Configurar la ventana
        this.setSize(1100, 900);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(cartelerapnl);
        this.setTitle("Cartelera");
        this.setLocationRelativeTo(null);

        // Agregar opciones de películas al JComboBox
        Opcionpeli.addItem("Pelicula 1");
        Opcionpeli.addItem("Pelicula 2");
        Opcionpeli.addItem("Pelicula 3");
        Opcionpeli.addItem("Pelicula 4");
        Opcionpeli.addItem("Pelicula 5");
        Opcionpeli.addItem("Pelicula 6");
        Opcionpeli.addItem("Pelicula 7");
        Opcionpeli.addItem("Pelicula 8");

        // Funcionalidad para el botón INGRESAR
        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Obtener la película seleccionada
                String peliculaSeleccionada = (String) Opcionpeli.getSelectedItem();
                JOptionPane.showMessageDialog(null, "Has seleccionado: " + peliculaSeleccionada);

                // Aquí redirigir a la ventana de Registro de Sucursales
                abrirRegistroSucursales();
            }
        });

        // Funcionalidad para el botón REGISTRAR SUCURSAL
        registarSucursalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Abrir ventana de registro de sucursales
                abrirRegistroSucursales();
            }
        });

        // Mostrar la ventana
        this.setVisible(true);
    }

    // Método que abre la ventana de registro de sucursales
    private void abrirRegistroSucursales() {
        new RegistroSucursalesGUI(conexion);  // Llamada a la ventana de registro de sucursales con la conexión
        dispose();  // Cerrar la ventana actual de cartelera
    }

    public static void main(String[] args) {
        new cartelera();
    }
}
