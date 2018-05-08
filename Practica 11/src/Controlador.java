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
    
    public ResultSet obtenerNota(String alumno, String curso, String evaluacion, String asignatura){
        String sentenciaSQL = "SELECT notas.nota " +
                            "FROM notas, alumnos, asignaturas, cursos " +
                            "WHERE alumnos.idAlumno = notas.idAlumno " +
                            "AND notas.idAsignatura = asignaturas.idAsignatura " +
                            "AND cursos.idCurso = asignaturas.idCurso " +
                            "AND alumnos.nombre LIKE '"+ alumno +"' " +
                            "AND cursos.curso LIKE '"+ curso +"' " +
                            "AND notas.evaluacion LIKE '"+ evaluacion +"' " +
                            "AND asignaturas.asignatura LIKE '"+ asignatura +"'";
        System.out.println(sentenciaSQL);
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo obtenerNota");
            return null;
        }
    }
    
    public void modificarNota(String alumno, String asignatura, String evaluacion, float nota){
        String sentenciaAlumno="SELECT idAlumno FROM alumnos WHERE nombre LIKE '"+alumno+"'";
        String sentenciaAsignatura="SELECT idAsignatura FROM asignaturas WHERE asignatura LIKE '"+asignatura+"'";
        String sentenciaSQL="UPDATE notas SET nota = "+nota+" WHERE evaluacion LIKE '"+evaluacion+"' "
                + "AND idAlumno LIKE '"+sentenciaAlumno+"' AND idAlumno LIKE '"+sentenciaAsignatura+"'";
        try {
            sentencia=conexion.createStatement();
            System.out.println(sentenciaSQL);
            System.out.println("La modificación de la nota se realizó con exito");
            int notaFinal = sentencia.executeUpdate(sentenciaSQL);
        } catch (Exception e) {
            System.out.println("No se pudo modificar la nota");
        }
    }
}
