/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author victor
 */
public class DivisionPorCeroException extends Exception{
    public DivisionPorCeroException(){
        super();
    }
    
    public DivisionPorCeroException(String titulo){
        super(titulo);
    }
}
