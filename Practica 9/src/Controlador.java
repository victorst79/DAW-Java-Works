
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
    
    private Articulo articulo;
    private Consumo consumo;
    private Barra barra;
    
    public Controlador(){
        String url = ".\\consumo.s3db";
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:"+url);
        } catch (SQLException e) {
            System.out.println("Fallo conexion base de datos");
        }
    }
    
    public ResultSet obtenerRegistros(String tabla){
        String sentenciaSQL = "SELECT * FROM "+ tabla;        
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo obtencion de registros");
            return null;
        }
    }
    
    public ResultSet getDatosTabla(String barra, String fecha){
        String sentenciaSQL = "SELECT Articulos.articulo, Consumo.unidades, Articulos.pvp " +
                            "FROM Articulos, Consumo, Barras " +
                            "WHERE Articulos.codigoArticulo = Consumo.codigoArticulo " +
                            "AND Barras.codigoBarra = Consumo.codigoBarra " +
                            "AND barra LIKE '"+ barra +"' " +
                            "AND fecha LIKE '"+ fecha +"'";
        
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo obtener datos barra");
            return null;
        }
    }
}
