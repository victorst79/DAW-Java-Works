/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victo
 */
public class Articulo {
    private String codigoArticulo, articulo;
    private int stock, pvp;
    
    public Articulo(String codigoArticulo, String articulo, int stock, int pvp){
        this.codigoArticulo = codigoArticulo;
        this.articulo = articulo;
        this.stock = stock;
        this.pvp = pvp;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public String getArticulo() {
        return articulo;
    }

    public int getStock() {
        return stock;
    }

    public int getPvp() {
        return pvp;
    }
    
}
