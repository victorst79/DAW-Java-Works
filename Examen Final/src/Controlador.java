/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
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
    
    public ResultSet obtenerEvaluacion(String curso){
        String sentenciaSQL = "SELECT DISTINCT evaluacion " +
                                "FROM notas, alumnos, cursos " +
                                "WHERE notas.idAlumno = alumnos.idAlumno " +
                                "AND alumnos.idCurso = cursos.idCurso " +
                                "AND cursos.idCurso = ( " +
                                "     SELECT idCurso " +
                                "     FROM cursos " +
                                "     WHERE curso LIKE '"+curso+"' " +
                                ") " +
                                "AND notas.nota IS NOT NULL";
        
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("FALLO OBTENER EVALUACIONES");
            return null;
        }
    }
    
    public ResultSet obtenerAsignaturas(String curso){
        String sentenciaSQL = "SELECT asignatura " +
                                "FROM asignaturas " +
                                "WHERE idCurso = (" +
                                "      SELECT idCurso " +
                                "      FROM cursos " +
                                "      WHERE curso LIKE '"+curso+"'" +
                                ")";
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("FALLO OBTENER ASIGNATURAS");
            return null;
        }
    }
    
    // OBTIENE EL NUMERO TOTAL QUE CURSAN UN CURSO 
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
    
    public ResultSet notasCurso(String evaluacion,String curso,String asignatura){
        String sentenciaSQL = "SELECT nota, evaluacion, cursos.curso , asignaturas.asignatura " +
                            "FROM notas, alumnos, cursos, asignaturas " +
                            "WHERE notas.idAlumno = alumnos.idAlumno " +
                            "AND alumnos.idCurso = cursos.idCurso " +
                            "AND asignaturas.idAsignatura =   notas.idAsignatura " +
                            "AND notas.idAsignatura = ( SELECT idAsignatura FROM asignaturas WHERE asignatura = '"+asignatura+"') " +
                            "AND alumnos.idCurso = (    SELECT idcurso     FROM cursos     WHERE curso LIKE '"+curso+"' ) " +
                            "AND evaluacion LIKE '"+evaluacion+"'";
        System.out.println(sentenciaSQL);
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);           
        } catch (SQLException e) {
            System.out.println("FALLO OBTENER NOTAS "+ curso);
            return null;
        }
    }
    
    public int numNotas(String evaluacion,String curso,String asignatura){
        String sentenciaSQL = "SELECT nota, evaluacion, cursos.curso , asignaturas.asignatura " +
                            "FROM notas, alumnos, cursos, asignaturas " +
                            "WHERE notas.idAlumno = alumnos.idAlumno " +
                            "AND alumnos.idCurso = cursos.idCurso " +
                            "AND asignaturas.idAsignatura =   notas.idAsignatura " +
                            "AND notas.idAsignatura = ( SELECT idAsignatura FROM asignaturas WHERE asignatura = '"+asignatura+"') " +
                            "AND alumnos.idCurso = (    SELECT idcurso     FROM cursos     WHERE curso LIKE '"+curso+"' ) " +
                            "AND evaluacion LIKE '"+evaluacion+"'";
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
    
    
}
