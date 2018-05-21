/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor
 */
import java.sql.*;
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
    
    public ResultSet obtenerRegistros(String tabla){
        String sentenciaSQL = "SELECT * FROM '"+ tabla +"'";
        System.out.println(sentenciaSQL);
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("FALLO OBTENER REGISTROS");
            return null;
        }
    }
    
    public ResultSet obtenerCurso(){
        String sentenciaSQL = "SELECT curso FROM cursos GROUP BY curso";
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("FALLO OBTENER CURSOS");
            return null;
        }
    }
    
    public ResultSet obtenerAsignaturas(String curso){
        String sentenciaSQL = "SELECT asignatura " +
                                "FROM asignaturas, cursos " +
                                "WHERE asignaturas.idCurso = cursos.idCurso " +
                                "AND cursos.idCurso = ( " +
                                "     SELECT idCurso " +
                                "     FROM cursos " +
                                "     WHERE curso = '"+ curso +"'" +
                                ")";
        System.out.println(sentenciaSQL);
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("FALLO OBTENER ASIGNATURAS");
            return null;
        }
    }
    
    // OBTIENE EL NUMERO TOTAL QUE CURSAN UN CURSO Y ASIGNATURA
    public int numAlumnos(String curso){
        String sentenciaSQL = "SELECT nombre " +
                                "FROM alumnos " +
                                "WHERE alumnos.idCurso = ( " +
                                "     SELECT idCurso " +
                                "     FROM cursos " +
                                "     WHERE curso = '"+ curso +"' " +
                                ")";
        int cont = 0;
        try {
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sentenciaSQL);
            if (resultado != null) {
                while (resultado.next()) {                    
                    cont++;
                }                
            }
            return cont;
        } catch (SQLException e) {
            System.out.println("FALLO OBTENER NUMERO ALUMNOS");
            return 0;
        }
    }
    
    // OBTIENE EL NUMERO DE ASIGNATURAS TOTALES DEL CURSO Y EVALUACION
    public int numAsignaturas(String curso){
        String sentenciaSQL = "SELECT asignatura " +
                                "FROM asignaturas, cursos " +
                                "WHERE asignaturas.idCurso = cursos.idCurso " +
                                "AND cursos.idCurso = ( " +
                                "     SELECT idCurso " +
                                "     FROM cursos " +
                                "     WHERE curso = '"+ curso +"'" +
                                ")";
        int cont = 0;
        try {
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sentenciaSQL);
            if (resultado != null) {
                while (resultado.next()) {                    
                    cont++;
                }                
            }
            return cont;
        } catch (SQLException e) {
            System.out.println("FALLO OBTENER NUMERO ASIGNATURAS");
            return 0;
        }
    }
    
    public ResultSet notasAsignatura(String evaluacion,String asignatura){
        String sentenciaSQL = "SELECT nota " +
                                "FROM notas " +
                                "WHERE evaluacion = '"+ evaluacion +"' " +
                                "AND idAsignatura = ( " +
                                " SELECT idAsignatura " +
                                " FROM asignaturas " +
                                " WHERE asignatura LIKE '"+ asignatura +"' " +
                                ")";
        System.out.println(sentenciaSQL);
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);           
        } catch (SQLException e) {
            System.out.println("FALLO OBTENER NOTAS" + asignatura);
            return null;
        }
    }
}
