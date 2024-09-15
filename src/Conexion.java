import java.sql.*;
public class Conexion
{
    String bd = "prime_cinema";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "root";
    String password = "Carta.345617";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;
    public Conexion(String bd)
    {
        this.bd = bd;
    }
    public Conexion connectar()
    {
        try {
            Class.forName(driver);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException e) {
            System.out.println("No se puede establecer el driver");
            throw new RuntimeException(e);
        }
        try {
            cx = DriverManager.getConnection(url+bd,user,password);
            System.out.println("Conexion establecida");
        } catch (SQLException e) {
            System.out.println("No se puede establecer el driver");
            throw new RuntimeException(e);
        }
        return this;
    }
    public void desconect()
    {
        try {
            cx.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[]args)
    {
        Conexion cx = new Conexion("prime_cinema");
        cx.connectar();
    }
}

