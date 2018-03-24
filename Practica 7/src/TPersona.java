/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class TPersona {
    
    private String nombre, direccion;
    private int edad, telefono;
    
    public TPersona(String nombre, String direccion, int edad, int telefono){
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    // NOMBRE
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nuevo){
        nombre = nuevo;
    }
    
    // DIRECCION
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String nuevo){
        direccion = nuevo;
    }
    
    // EDAD
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int nuevo){
        edad = nuevo;
    }
    
    // TELEFONO
    public int getTelefono(){
        return telefono;
    }
    
    public void setTelefono(int nuevo){
        telefono = nuevo;
    }
    
}
