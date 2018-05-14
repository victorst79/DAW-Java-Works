
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor
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
    
    public ResultSet obtenerRegistros(String tabla, String grupo){
        String sentenciaSQL = "SELECT * FROM "+ tabla +" GROUP BY "+ grupo;
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo obtenerRegistros()");
            return null;
        }
    }
    
    public ResultSet obtenerNotas(String evaluacion, String curso){
        String sentenciaSQL = "SELECT notas.nota , cursos.idCurso, asignaturas.asignatura " +
                                "FROM notas, asignaturas, cursos " +
                                "WHERE asignaturas.idAsignatura = notas.idAsignatura " +
                                "AND asignaturas.idCurso = cursos.idCurso " +
                                "AND notas.evaluacion LIKE '"+ evaluacion +"' " +
                                "AND cursos.idCurso = ( " +
                                "      SELECT cursos.idCurso " +
                                "      FROM cursos " +
                                "      WHERE cursos.curso LIKE '"+ curso +"')";
        System.out.println(sentenciaSQL);        
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo obtenerNotas()");
            return null;
        }
    }
}
