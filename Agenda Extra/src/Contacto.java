/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor
 */
// MODELO
public class Contacto {
    private String nombre,direccion,localidad,telefono,mail;
    private int edad;
    
    public Contacto(String nom, String dir, String local, String telef, String email, int age){
        nombre = nom;
        direccion = dir;
        localidad = local;
        telefono = telef;
        mail = email;
        edad = age;        
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getMail() {
        return mail;
    }

    public int getEdad() {
        return edad;
    }
    
}
