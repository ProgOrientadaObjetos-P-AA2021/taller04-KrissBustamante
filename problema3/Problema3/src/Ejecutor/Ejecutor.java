/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutor;
import problema3.Automotor;
/**
 *
 * @author USER
 */
public class Ejecutor {
     public static void main(String[] args) {
    Automotor A = new Automotor(1100254875, "Mercedes-Benz",
            2002,33528);
        A.calcularMatricula();
        Automotor A2 = new Automotor(1100698419, "Ford", 2004,50125);
        A2.calcularMatricula();
        System.out.println(A.toString() + "\n\n"
                + A2.toString());
    
        
        
    }
}
