/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor;
import problema4.Cheque;
/**
 *
 * @author USER
 */
public class Ejecutor {
    public static void main(String[] args) {
    Cheque C = new Cheque("Rene", "Coopmego", 1258.5);
        C.calcularComision();
        Cheque C2 = new Cheque("Maria", "Banco Pichincha", 1525.6);
        C2.calcularComision();
        System.out.println(C.toString() + "\n"
                + C2.toString());
    
        
        
    }
    
}

