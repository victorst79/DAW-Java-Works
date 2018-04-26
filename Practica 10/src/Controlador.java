
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class Controlador {
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultado;
    
    public Controlador(){
        String url = ".\\baloncesto.s3db";
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:"+url);
            System.out.println("Conexion DB realizada");
        } catch (SQLException e) {
            System.out.println("Fallo conexion DB");
        }
    }
    
    public ResultSet obtenerJornada(){
        String sentenciaSQL = "SELECT * FROM Jornadas";
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo obtenerJornada()");
            return null;
        }
    }
    
    public ResultSet obtenerPartido(){
        String sentenciaSQL = "SELECT * FROM ";
        // REVISAR ESTA PARTE
        return null;
    }
}
