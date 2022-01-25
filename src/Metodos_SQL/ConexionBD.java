package Metodos_SQL;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    public static String url = "jdbc:mysql://localhost/proyectobd";
    public static String usuario = "hospital";
    public static String contraseña = "hospital123";
    public static String clase = "com.mysql.jdbc.Driver";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName(clase);
            conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return conexion;
    }
}
