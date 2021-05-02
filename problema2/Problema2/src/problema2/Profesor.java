/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema2;

/**
 *
 * @author USER
 */
public class Profesor {
    
    
    private String nombre;
     private String apellido;
    private double sbasico;
    private double stotal;
    private int cedula;
    private double porcentaje;
    public Profesor(String nom, String ape,
            double sba, int ced){
    
    nombre = nom;
    apellido = ape;
    sbasico = sba;
    cedula = ced;
    }
    
     public void establecerNombre(String nombre){
     nombre = nombre;
     
     }
     public String obtenerNombre(){
         return nombre;
     }
      public void establecerApellido(String apellido){
     apellido = apellido;
     
     }
     public String obtenerApellido(){
         return apellido;
     
    }
      public void establecerSbasico(double sbasico){
     sbasico = sbasico;
     
     }
     public double obtenerSbasico(){
         return sbasico;
     }

 public void establecerCedula(int cedula){
     cedula = cedula;
     
     }
     public int obtenerCedula(){
         return cedula;
     }
      public void calcularStotal(){
     porcentaje = sbasico * 0.2;
     stotal = sbasico + porcentaje;
     
     }
     public double obtenerStotal(){
         return stotal;
     }

     @Override
    public String toString() {
        return String.format("Nombre: %s \n"
                + "Apellido: %s \n"
                + "Sueldo Básico: %.2f \n"
                + "Sueldo Total: %.2f \n"
                + "Cedula: %d", obtenerNombre(),obtenerApellido(),
                obtenerSbasico(), obtenerStotal () ,obtenerCedula());
    }
     
     
     
}
     

   
   
    
    

