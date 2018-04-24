/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class Puntuacion {
    private String codigoJornada, codigoPartida, codigoEquipo;
    private int intentos1, canastas1, intentos2, canastas2, intentos3, canastas3;

    public Puntuacion(String codigoJornada, String codigoPartida, String codigoEquipo, int intentos1, int canastas1, int intentos2, int canastas2, int intentos3, int canastas3) {
        this.codigoJornada = codigoJornada;
        this.codigoPartida = codigoPartida;
        this.codigoEquipo = codigoEquipo;
        this.intentos1 = intentos1;
        this.canastas1 = canastas1;
        this.intentos2 = intentos2;
        this.canastas2 = canastas2;
        this.intentos3 = intentos3;
        this.canastas3 = canastas3;
    }

    public String getCodigoJornada() {
        return codigoJornada;
    }

    public String getCodigoPartida() {
        return codigoPartida;
    }

    public String getCodigoEquipo() {
        return codigoEquipo;
    }

    public int getIntentos1() {
        return intentos1;
    }

    public int getCanastas1() {
        return canastas1;
    }

    public int getIntentos2() {
        return intentos2;
    }

    public int getCanastas2() {
        return canastas2;
    }

    public int getIntentos3() {
        return intentos3;
    }

    public int getCanastas3() {
        return canastas3;
    }
        
    
}
