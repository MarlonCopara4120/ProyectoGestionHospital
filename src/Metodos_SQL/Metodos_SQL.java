package Metodos_SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Metodos_SQL {

    public static PreparedStatement sentencia_preparada;
    public static ResultSet resultado;

    public int guardar(String nombre, String apellidos, String servicio, String usuario, String contraseña) throws SQLException {
        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO login (Nombre,Apellido,Servicio,Usuario,Contraseña)VALUES(?,?,?,?,?)");

        try {
            conexion = ConexionBD.conectar();
            sentencia_preparada = conexion.prepareStatement(sentencia_guardar);
            sentencia_preparada.setString(1, nombre);
            sentencia_preparada.setString(2, apellidos);
            sentencia_preparada.setString(3, servicio);
            sentencia_preparada.setString(4, usuario);
            sentencia_preparada.setString(5, contraseña);

            resultado = sentencia_preparada.executeUpdate();
            sentencia_preparada.close();
            conexion.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return resultado;
    }

    public static String buscarNombre(String usuario) {
        String busqueda_nombre = null;
        Connection conexion = null;

        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar = ("SELECT Nombre,Apellido,Servicio FROM login WHERE Usuario = '" + usuario + "'");
            sentencia_preparada = conexion.prepareStatement(sentencia_buscar);
            resultado = sentencia_preparada.executeQuery();

            if (resultado.next()) {
                String nombre = resultado.getString("Nombre");
                String apellidos = resultado.getString("Apellido");
                busqueda_nombre = (nombre + "" + apellidos);

                conexion.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_nombre;
    }

    public static String buscarUsuarioRegistrado(String usuario, String contraseña) {
        String busqueda_usuario = null;
        Connection conexion = null;

        try {
            conexion = ConexionBD.conectar();
            String sentencia_buscar_usuario = ("SELECT Nombre,Apellido,Servicio,Usuario,Contraseña FROM login WHERE Usuario= '" + usuario + "' &&Contraseña='" + contraseña + "'");

            sentencia_preparada = conexion.prepareStatement(sentencia_buscar_usuario);
            resultado = sentencia_preparada.executeQuery();
            if (resultado.next()) {
                busqueda_usuario = "Usuario Encontrado";
            } else {
                busqueda_usuario = "Usuario no Encontrado";
            }

            conexion.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return busqueda_usuario;
    }
}
