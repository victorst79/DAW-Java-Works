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
    
    public Controlador(){
        String url = ".\\alumnos.s3db";
        
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:"+url);
            System.out.println("Conexion DB-Alumnos realizada");
        } catch (SQLException e) {
            System.out.println("Fallo conexion DB-Alumnos");
        }
    }
    
    public ResultSet obtenerRegistros(String tabla,String grupo){
        String sentenciaSQL = "SELECT * FROM "+ tabla +" GROUP BY "+ grupo;
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo obtenerRegistro()");
            return resultado = null;
        }
    }
    
    public ResultSet obtenerAsignaturas(String curso){
        String sentenciaSQL = "SELECT asignaturas.asignatura " +
                                "FROM asignaturas JOIN cursos " +
                                "ON asignaturas.idCurso = cursos.idCurso " +
                                "AND cursos.curso LIKE '"+curso+"' " +
                                "GROUP BY asignatura";
        System.out.println(sentenciaSQL);
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo obtenerAsignaturas");
            return null;
        }
    }
    
    public ResultSet obtenerAlumnos(String curso){
        String sentenciaSQL = "SELECT nombre " +
                            "FROM alumnos JOIN cursos " +
                            "ON alumnos.idCurso = cursos.idCurso " +
                            "AND cursos.curso LIKE '"+curso+"'";
        System.out.println(sentenciaSQL);
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo obtenerAlumnos");
            return null;
        }
    }
}
