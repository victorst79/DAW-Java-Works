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
// CONTROLADOR
public class AgendaBD {
    private Connection conexion;
    private Statement sentencia;
    private ResultSet resultado;    
    
    private Contacto contacto;
    
    public AgendaBD(){
        String url = "C:\\Users\\victo\\Desktop\\proyectos\\Agenda\\Agenda.s3db";        
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:"+url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (conexion != null) {
            System.out.println("Conexion realizada con exito");
        }
    }
    
    public ResultSet obtenerRegistros(String tabla){        
        String sentenciaSQL = "SELECT * FROM " + tabla + " ORDER BY nombre";
        try {
            sentencia = conexion.createStatement();
            return resultado = sentencia.executeQuery(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("No se pudo realizar la consulta Registros()");
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
                String nom = resultado.getString("nombre");
                String dir = resultado.getString("direccion");
                String local = resultado.getString("localidad");
                String mail = resultado.getString("correo");
                String telef = resultado.getString("telefono");
                int edad = resultado.getInt("edad");
                
                contacto = new Contacto(nom, dir, local, telef, mail, edad);
            }
        } catch (SQLException e) {
            System.out.println("No se puedo realizar la consulta Contacto()");
            return null;
        }
        return contacto;
    }
    
    public void insertarContacto(Contacto contacto){
        String nombre = contacto.getNombre();
        String direccion = contacto.getDireccion();
        String localidad = contacto.getLocalidad();
        String correo = contacto.getMail();
        String telefono = contacto.getTelefono();
        int edad = contacto.getEdad();
        int resultado_update;
        
        String sentenciaSQL = "INSERT INTO contactos VALUES('"+ nombre +"','"+ direccion +"','"+ localidad +"','"+ correo +"','"+ telefono +"'," +edad + ")";
        System.out.println(sentenciaSQL);
        
        try {
            sentencia = conexion.createStatement();
            resultado_update = sentencia.executeUpdate(sentenciaSQL);
        } catch (SQLException e) {
            System.out.println("FALLO de inserccion");
        }
    }
}
