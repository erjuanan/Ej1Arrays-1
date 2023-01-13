/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1arraysuni;

import numero.Numero;

/**
 *
 * @author dam
 */
public class Ej1ArraysUni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Parking parking = new Parking(3);
        parking.inicializar();
        int opcion;
        menu();
        opcion = Numero.pedirNumero("Opcion:", 1, 4);
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    System.out.println(
                            parking.entradaVehiculo());
                    break;
                case 2:
                    System.out.println(
                            parking.salidaVehiculo());
                    break;
                case 3:parking.verEstado();
                    break;
            }
            menu();
            opcion = Numero.pedirNumero("Opcion:", 1, 4);
        }

    }

    private static void menu() {
        System.out.println("1. Nuevo Vehiculo");
        System.out.println("2. Salida Vehiculo");
        System.out.println("3. Estado");
        System.out.println("4 Fin");
       

    }

}
