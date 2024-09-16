package ventana.login.Clases;

import java.lang.module.ResolutionException;
import java.sql.*;

public class Conexion {
    public static Connection ConectarBD(String bd) {
        Connection conexion;
        String host = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "123456";  // Asegúrate de que sea la correcta

        System.out.println("Conectando...");
        try {
            conexion = DriverManager.getConnection(host + bd, user, password);
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
            throw new RuntimeException(e);
        }

        return conexion;
    }

    public static void Desconectar(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Desconectado");
            } catch (SQLException e) {
                System.out.println("Error al desconectar: " + e.getMessage());
                throw new RuntimeException(e);
            }
        } else {
            System.out.println("No hay conexión para cerrar.");
        }
    }

    public static void ConsultaContraseñas(Connection conexion) {
        String consulta = "select contraseña from Usuarios";
        Statement stmt;
        ResultSet rs;
        int id;
        String login;
        String contraseña;
        String nombreCompleto;
        String dui;
        String direccion;
        String correo;
        String telefono;



        try {
            stmt = conexion.createStatement();
            rs = stmt.executeQuery(consulta);


            while (rs.next()) {
                id = rs.getInt("id_usuario");
                login = rs.getString("login");
                contraseña = rs.getString("contraseña");
                nombreCompleto = rs.getString("nombreCompleto");
                dui = rs.getString("DUI");
                direccion = rs.getString("direccion");
                correo = rs.getString("correo");
                telefono = rs.getString("telefono");
                System.out.println("Su id es: "+id+ " y su nombre es: "+nombreCompleto);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }




    public static void main(String[] args) {
        Connection bd = ConectarBD("primecinema");
        ConsultaContraseñas(bd);
        Desconectar(bd);

    }




}
