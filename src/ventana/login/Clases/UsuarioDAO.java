package ventana.login.Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    public Usuario validarLogin(Connection conexion, String login, String contraseña) {
        String sql = "SELECT * FROM Usuarios WHERE login = ? AND contraseña = ?";
        Usuario usuario = null;

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, login);
            statement.setString(2, contraseña);
            ResultSet resultSet = statement.executeQuery();

            // Depuración: imprimir el SQL y los parámetros
            System.out.println("Ejecutando: " + statement.toString());

            if (resultSet.next()) {
                // Obtener el nombre completo directamente
                String nombreCompleto = resultSet.getString("NombreCompleto");

                usuario = new Usuario(
                        resultSet.getInt("id_usuario"),
                        resultSet.getString("login"),
                        resultSet.getString("contraseña"),
                        nombreCompleto, // Cambia a nombre completo
                        resultSet.getString("DUI"),
                        resultSet.getString("direccion"),
                        resultSet.getString("correo"),
                        resultSet.getString("telefono")
                );
            } else {
                System.out.println("No se encontró ningún usuario con esas credenciales.");
            }
        } catch (SQLException e) {
            System.out.println("Error al validar login: " + e.getMessage());
        }

        return usuario; // Retorna el usuario si existe, de lo contrario retorna null
    }

    public boolean registrarUsuario(Connection conexion, Usuario usuario) {
        String sql = "INSERT INTO Usuarios (login, telefono, correo, direccion, NombreCompleto, DUI, contraseña) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, usuario.getLogin());
            statement.setString(2, usuario.getTelefono());
            statement.setString(3, usuario.getCorreo());
            statement.setString(4, usuario.getDireccion());
            statement.setString(5, usuario.getNombreCompleto()); // Cambiado a NombreCompleto
            statement.setString(6, usuario.getDUI());
            statement.setString(7, usuario.getContraseña());

            statement.executeUpdate();
            System.out.println("Registro exitoso!");

        } catch (SQLException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
        }
        return true; // Cambiado a true para indicar que se realizó el registro
    }
}
