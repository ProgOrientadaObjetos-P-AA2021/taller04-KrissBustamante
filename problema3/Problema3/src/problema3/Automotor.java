/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

/**
 *
 * @author USER
 */
public class Automotor {

    
    private int cedula;
    private int año;
     private String marca;
    private double valor;
    private double matricula;
    private int antiguedad;
public Automotor(int ced, String mar, int a
           , double val){
    
    cedula = ced;
    año = a ;
    marca = mar;
    valor = val;
    
    }

 public void establecerCedula(int ced){
     cedula = ced;
     
     }
     public int obtenerCedula(){
         return cedula;
     }
      public void establecerMarca(String mar){
     marca = mar;
     
     }
     public String obtenerMarca(){
         return marca;
     }
      public void establecerAño(int a){
     año = a;
     
     }
     public int obtenerAño(){
         return año;
     }

      public void establecerValor(double val){
     valor = val;
     
     }
     public double obtenerValor(){
         return valor;
     }
     public void calcularMatricula(){
     antiguedad = 2020 - año;
     matricula =(valor*0.00002) * antiguedad;
     
     }
     public double obtenerMatricula(){
         return matricula;
     }
   
 @Override
    public String toString() {
        return String.format("Cédula del dueño,: %d \n"
                + "Marca de vehículo: %s \n"
                + "Año de fabricación: %d \n"
                + "Valor de vehículo: %.2f \n"
                + "Valor de la matricula: %.2f \n"
                , obtenerCedula(),obtenerMarca(),
                obtenerAño(), obtenerValor (), obtenerMatricula());
    }
}
    

