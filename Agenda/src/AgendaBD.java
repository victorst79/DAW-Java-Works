/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author victo
 */
public class AgendaBD {
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultado;
    
    public AgendaBD(){
        String url = "C:\\Users\\victo\\Desktop\\proyectos\\Agenda\\Agenda.s3db";        
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:"+url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet obtenerRegistros(String tabla){        
        String sentenciaSQL = "SELECT * FROM " + tabla + " ORDER BY nombre";
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la consulta");
            return null;
        }
        
    }
}
