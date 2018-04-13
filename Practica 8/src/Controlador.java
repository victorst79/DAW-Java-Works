
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class Controlador {
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultado;
    
    private Coche automovil;
    private Infraccion infraccion;
    private Multa multa;
    
    public Controlador(){
        String url = ".\\infracciones.s3db";
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:"+url);
        } catch (SQLException e) {
            System.out.println("FALLO CONEXION BD");
        }
    }
    
    public ResultSet obtenerRegistros(String tabla){
        String sentenciaSQL = "SELECT * FROM " + tabla;
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {            
            System.out.println("FALLO obtenerRegistros()");
            return null;
        }
    }
    
    public Coche obtenerCoche(String valor){
        String sentenciaSQL = "SELECT * FROM Coches WHERE nombre = "+ valor;
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sentenciaSQL);
            automovil = null;
            if (resultado.next()) {
                String codigo = resultado.getString("codigo");
                String nif = resultado.getString("nif");
                String nombre = resultado.getString("nombre");
                String direccion = resultado.getString("direccion");
                String matricula = resultado.getString("matricula");
                String coche = resultado.getString("coche");
                
                automovil = new Coche(codigo,nif,nombre,direccion,matricula,coche);
            }
        } catch (SQLException e) {
            System.out.println("FALLO obtenerCoche()");
            return null;
        }
        return automovil;
    }
}
