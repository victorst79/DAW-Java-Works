/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class Infraccion {
    private String codigoInfraccion, infraccion;
    private int penalizacion;
    
    public Infraccion(String codigoInfraccion, String infraccion, int penalizacion){
        this.codigoInfraccion = codigoInfraccion;
        this.infraccion = infraccion;
        this.penalizacion = penalizacion;
    }

    public String getCodigoInfraccion() {
        return codigoInfraccion;
    }

    public String getInfraccion() {
        return infraccion;
    }

    public int getPenalizacion() {
        return penalizacion;
    }
    
    
}
