import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion
{
    public static Connection ConectarBD(String bd){
        Connection conexion;
        String host = "jdbc:mysql://localhost:3306/";
        String user = "root";
        String password = "123456";

        System.out.println("Conectando...");
        try {
            conexion = DriverManager.getConnection(host+bd,user,password);
            System.out.println("Conectado");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }

        return conexion;
    }

    public static void Desconectar(Connection conexion){
        try {
            conexion.close();
            System.out.println("Desconectado");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args)
    {
        Connection bd = ConectarBD("primecinema");
        Desconectar(bd);
    }
}

