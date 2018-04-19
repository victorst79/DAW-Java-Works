/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class Consumo {
    private int numeroConsumo, unidades;
    private String fecha, codigoArticulo, codigoBarra;

    public Consumo(int numeroConsumo, String fecha, String codigoArticulo, int unidades, String codigoBarra) {
        this.numeroConsumo = numeroConsumo;
        this.unidades = unidades;
        this.fecha = fecha;
        this.codigoArticulo = codigoArticulo;
        this.codigoBarra = codigoBarra;
    }

    public int getNumeroConsumo() {
        return numeroConsumo;
    }

    public int getUnidades() {
        return unidades;
    }

    public String getFecha() {
        return fecha;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }
    
}
