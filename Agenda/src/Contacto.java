/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class Contacto {
    private String nombre,direccion,localidad,telefono,mail;
    private int edad;
   
   public Contacto(String nom,String dir,String locald,String tlf,String email, int edad){
       nombre = nom;
       direccion = dir;
       localidad = locald;
       telefono = tlf;
       mail = email;
       this.edad = edad;       
   }
      
}