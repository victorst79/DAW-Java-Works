/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author medina
 */
public class MainDivisionPorCero {
    public static void main(String [] args) {
        double suma=0, n;
        int cont=0;
        do{
           System.out.print("Introduce numero: ");
           n = EntradaConsola.leeReal();
           suma+=n;
           cont++;
        }while(n!=0);
        try{
            System.out.println("La media es: " + Mate.divide(suma, cont-1));
        } catch(DivisionPorCeroException e) {
            System.out.println("No se puede dividir por cero");
        }
    }
}
