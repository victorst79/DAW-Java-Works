
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
// CONTROLADOR
public class AgendaBD {
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultado;
    
    private Contacto contacto;
    
    public AgendaBD(){
        String url = ".\\Agenda.s3db";
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:"+url);
        } catch (SQLException e) {
            System.out.println("Fallo conexion con Base de datos");
        }
    }
    
    public ResultSet obtenerRegistros(String tabla){
        String sentenciaSQL = "SELECT * FROM " + tabla + " ORDER BY nombre";
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo obtencion de registros");
            return null;
        }
    }
    
    public Contacto obtenerContacto(String valor){
        String sentenciaSQL = "SELECT * FROM contactos WHERE nombre = '"+ valor +"'";
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sentenciaSQL);
            contacto = null;
            if (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String direccion = resultado.getString("direccion");
                String localidad = resultado.getString("localidad");
                String telefono = resultado.getString("telefono");
                String correo = resultado.getString("correo");
                int edad = Integer.parseInt(resultado.getString("edad"));
                
                contacto = new Contacto(nombre,direccion,localidad,telefono,correo,edad);
            }
        } catch (SQLException e) {
            System.out.println("Fallo obtencion contacto");
            return null;
        }
        return contacto;
    }
    
    public void creacionContacto(Contacto contacto){
        String nombre = contacto.getNombre();
        String direccion = contacto.getDireccion();
        String localidad = contacto.getLocalidad();
        String telefono = contacto.getLocalidad();
        String correo = contacto.getLocalidad();
        int edad = contacto.getEdad();
        
        //RESPUESTA DE UPDATES E INSERT INT
        int respuesta_creacion;
        
        String sentenciaSQL = "INSERT INTO contactos VALUES('"+nombre+"','"+direccion+"','"+localidad+"','"+telefono+"','"+correo+"',"+edad+")";
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            respuesta_creacion = sentencia.executeUpdate(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo creacion contacto");
        }
    }
    
    public void modificarContacto(Contacto contacto, String constante){
        String nombre = contacto.getNombre();
        String direccion = contacto.getDireccion();
        String localidad = contacto.getLocalidad();
        String telefono = contacto.getTelefono();
        String correo = contacto.getMail();
        int edad = contacto.getEdad();
        
        //RESPUESTA DE UPDATES E INSERT INT
        int respuesta_modifi;
        
        String sentenciaSQL = "UPDATE contactos SET nombre = '"+nombre+"' , direccion = '"+direccion+"' , localidad = '"+localidad+"' , telefono = '"+telefono+"'"
                + ", correo = '"+correo+"' , edad = "+edad+" WHERE nombre = '"+constante+"'";
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            respuesta_modifi = sentencia.executeUpdate(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo modificacion de contacto");
        }
    }
    
    public void borrarContacto(Contacto contacto){
        String nombre = contacto.getNombre();
        String direccion = contacto.getDireccion();
        String localidad = contacto.getLocalidad();
        String telefono = contacto.getTelefono();
        String correo = contacto.getMail();
        int edad = contacto.getEdad();
        
        //RESPUESTA DE UPDATES E INSERT INT
        int respuesta_borrado;
        
        String sentenciaSQL = "DELETE FROM contactos WHERE nombre = '"+nombre+"' AND direccion = '"+direccion+"' AND localidad = '"+localidad+"' "
                + "AND telefono = '"+telefono+"' AND correo = '"+correo+"' AND edad = "+edad;
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            respuesta_borrado = sentencia.executeUpdate(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("Fallo borrado de contacto");
        }
    }
}
