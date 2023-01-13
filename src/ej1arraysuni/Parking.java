/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1arraysuni;

import numero.Numero;

/**
 *
 * @author dam
 */
public class Parking {
    String[] plazas;

    public Parking() {
        plazas=new String[100];
    }
     public Parking(int nplazas) {
        plazas=new String[nplazas];
    }
     public void inicializar(){
         for ( int nplaza=0; nplaza< plazas.length;nplaza++)
         {
             plazas[nplaza]="libre";
         }
     }
     public void verEstado(){
         System.out.println("NPLAZA\t ESTADO");
         for( int nplaza=0; nplaza<plazas.length;nplaza++)
         {
            System.out.println(nplaza +"\t"+ plazas[nplaza]);
         }
     }
     /**
      * Metodo que busca la primera plaza libre
      * @return  posicion del la primera plaza libre o -1 en el caso
      * de que el parking este completo
      */
     public int buscarPlazaLibre(){
         int nplaza=0;
         boolean encontrado=false;
         while ( !encontrado && nplaza< plazas.length){
             if ( plazas[nplaza].equalsIgnoreCase("libre"))
                 encontrado=true;
             else
                 nplaza++;
         }
         
         if (!encontrado)
            nplaza=-1;
         return nplaza;
     }
     public String entradaVehiculo(){
         String salida;
         int nplaza=buscarPlazaLibre();
         if (nplaza!=-1){
             plazas[nplaza]="Ocupada";
             salida=" plaza Asignada "+ nplaza;
         }else {
             salida="No ha sido asignada la plaza."
                     + " Parking completo";
         }
         return salida;
     }
     public String salidaVehiculo(){
         int nplaza;
         String salida;
         nplaza=Numero.pedirNumero(
                 "introduce el numero plaza a liberar",
                 0, plazas.length-1);
      if(plazas[nplaza].equalsIgnoreCase("libre"))   
      {
          salida="la plaza "+nplaza + " ya estaba libre";
         
      }
      else{
          plazas[nplaza]="libre";
          salida="la plaza "+nplaza + " ya se ha dejado libre";
      }
      return salida;
     }
    
}
