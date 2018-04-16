/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class Multa {
    private String codigoCoche, codigoInfraccion, fecha;
    
    public Multa(String codigoCoche, String codigoInfraccion, String fecha){
        this.codigoCoche = codigoCoche;
        this.codigoInfraccion = codigoInfraccion;
        this.fecha = fecha;
    }

    public String getCodigoCoche() {
        return codigoCoche;
    }

    public String getCodigoInfraccion() {
        return codigoInfraccion;
    }

    public String getFecha() {
        return fecha;
    }
    
    
}
