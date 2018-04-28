/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class Partido {
    private String jornada, codigoPartido, codigoEquipo1, codigoEquipo2;

    public Partido(String jornada, String codigoPartido, String codigoEquipo1, String codigoEquipo2) {
        this.jornada = jornada;
        this.codigoPartido = codigoPartido;
        this.codigoEquipo1 = codigoEquipo1;
        this.codigoEquipo2 = codigoEquipo2;
    }

    public String getJornada() {
        return jornada;
    }

    public String getCodigoPartido() {
        return codigoPartido;
    }

    public String getCodigoEquipo1() {
        return codigoEquipo1;
    }

    public String getCodigoEquipo2() {
        return codigoEquipo2;
    }
    
}
