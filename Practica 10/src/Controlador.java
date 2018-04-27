
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
    
    public ResultSet obtenerPartido(String jornada){
        String sentenciaSQL = "SELECT codigoPartido FROM partidos WHERE jornada LIKE '"+jornada+"' GROUP BY codigoPartido";
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo obtenerPartido()");
            return null;
        }
    }
    
    public ResultSet datosPartido(String jornada, String partido){
        String sentenciaSQL = "SELECT jornadas.fecha, partidos.codigoEquipo1, partidos.codigoEquipo2 " +
                                "FROM jornadas JOIN partidos " +
                                "ON partidos.jornada = jornadas.jornada " +
                                "AND jornadas.jornada = '"+ jornada +"' " +
                                "AND partidos.codigoPartido = '"+ partido +"'";
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo datosPartido");
            return null;
        }
    }   
            
    public ResultSet cambioEquipo(String equipo){
        String sentenciaSQL = "SELECT equipos.nombre " +
                                "FROM equipos " +
                                "WHERE equipos.codigoEquipo = '"+equipo+"'";
        System.out.println(sentenciaSQL);
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("FalloCambio Equipo");
            return null;
        }
    }
    
    public ResultSet obtenerCanastas(String jornada, String partido, String equipo){
        String sentenciaSQL = "SELECT * FROM puntuaciones, equipos"
                + " WHERE puntuaciones.codigoEquipo LIKE equipos.codigoEquipo"
                + " AND codigoJornada LIKE '"+jornada+"'"
                + " AND codigoPartido LIKE '"+partido+"'"
                + " AND nombre LIKE '"+equipo+"'";
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo obtenerCanastas");
            return null;
        }
    }
}
