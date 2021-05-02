/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema4;

/**
 *
 * @author USER
 */
public class Cheque {

   private String nombre;
     private String banco;
    private double cheque;
    private double comision;
public Cheque(String nom, String ban,
            double che){
    
    nombre = nom;
    banco = ban;
    cheque = che;
    
    }

 public void establecerNombre(String nomb){
     nombre = nomb;
     
     }
     public String obtenerNombre(){
         return nombre;
     }
      public void establecerBanco(String ban){
     banco = ban;
     
     }
     public String obtenerBanco(){
         return banco;
     }
      public void establecerCheque(double cheq){
     cheque = cheq;
     
     }
     public double obtenerCheque(){
         return cheque;
     }

      public void calcularComision(){
     comision = cheque *0.00003;
     
     }
     public double obtenerComision(){
         return comision;
     }
 @Override
    public String toString() {
        return String.format("Nombre: %s \n"
                + "Banco: %s \n"
                + "Cheque: %.2f \n"
                + "Comision Total: %.2f \n"
                , obtenerNombre(),obtenerBanco(),
                obtenerCheque(), obtenerComision () );
    }
}

