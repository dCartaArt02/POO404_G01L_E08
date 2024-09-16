package Registrar_Sucursales;

import ventana.login.Clases.Conexion;
import ventana.login.cartelera; // Importar la clase cartelera

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistroSucursalesGUI extends JFrame {
    private JTextField txtNombre;
    private JTextField txtEncargado;
    private JTextField txtDireccion;
    private JTextField txtTelefono;
    private JButton btnRegistrar;
    private JPanel RegistroSucursalesPanel;
    private JButton cancelarButton;

    private Connection conexion;

    // Constructor que recibe la conexión a la base de datos
    public RegistroSucursalesGUI(Connection conexion) {
        super("Registro de Sucursales");

        // Asignar la conexión a la variable local
        this.conexion = conexion;

        // Establecer el panel como el contenido de la ventana
        setContentPane(RegistroSucursalesPanel);

        // Configurar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(650, 350);
        setLocationRelativeTo(null); // Centrar la ventana
        setVisible(true);

        // Agregar funcionalidad a los botones
        addActionListeners();
    }

    private void addActionListeners() {
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarSucursal();
            }
        });

        // Agregar funcionalidad al botón de cancelar
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                regresarACartelera();
            }
        });
    }

    private void registrarSucursal() {
        // Recoger los valores del formulario
        String nombreSucursal = txtNombre.getText();
        String gerente = txtEncargado.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();

        // Validar que todos los campos tengan datos
        if (!nombreSucursal.isEmpty() && !gerente.isEmpty() && !direccion.isEmpty() && !telefono.isEmpty()) {
            String sql = "INSERT INTO sucursales (nombre_sucursal, gerente, direccion, telefono) VALUES (?, ?, ?, ?)";

            try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
                stmt.setString(1, nombreSucursal);
                stmt.setString(2, gerente);
                stmt.setString(3, direccion);
                stmt.setString(4, telefono);

                // Ejecutar la inserción
                stmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Sucursal registrada exitosamente.");
                clearFields(); // Limpiar los campos después de registrar
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error al registrar la sucursal: " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos.");
        }
    }

    private void clearFields() {
        // Limpiar los campos del formulario
        txtNombre.setText("");
        txtEncargado.setText("");
        txtDireccion.setText("");
        txtTelefono.setText("");
    }

    private void regresarACartelera() {
        // Cerrar la ventana actual
        this.dispose();

        // Abrir la ventana de cartelera
        new cartelera();  // Crear una nueva instancia de la cartelera
    }

    public static void main(String[] args) {
        // Conectar a la base de datos
        Connection conexion = Conexion.ConectarBD("primecinema");

        // Crear la GUI
        SwingUtilities.invokeLater(() -> new RegistroSucursalesGUI(conexion));
    }
}
