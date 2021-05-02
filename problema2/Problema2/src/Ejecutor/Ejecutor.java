/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor;
import problema2.Profesor;
/**
 *
 * @author USER
 */
public class Ejecutor {
    public static void main(String[] args) {
    Profesor P = new Profesor("Jose", "Palacios", 1250.5,1100365878);
        P.calcularStotal();
        Profesor P2 = new Profesor("Maria", "Toapanta", 1140.5,1100241416);
        P2.calcularStotal();
        System.out.println(P.toString() + "\n\n"
                + P2.toString());
    
        
        
    }
    
}
