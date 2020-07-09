/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resort;

import Hotel.PiedraAzul;
import Hotel.PiedraBlanca;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Resort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int desicion2 = 1;              
        int numeroHabitaciones = 0;
        int numeroPersonas = 0;
        Scanner desicion = new Scanner(System.in);
        while (desicion2 == 1){
            System.out.println("Cadena Hotelera Costa Azul");
            System.out.println("Ingrese 1 para resort Piedra Azul o 2 para Piedra Blanca");
            System.out.println("Luego ingrese 1 para habitación doble o 2 para habitación cuádruple");
            System.out.println("Ingrese el número de habitaciones que requiere y luego el número de personas");
            int hotel = Integer.parseInt(desicion.next());
            int tipoHabitacion = Integer.parseInt(desicion.next());
            numeroHabitaciones += Integer.parseInt(desicion.next());
            numeroPersonas += Integer.parseInt(desicion.next());

            if( hotel == 2){
                if (tipoHabitacion == 1){
                    PiedraBlanca piedraBlanca = new PiedraBlanca (0,numeroHabitaciones,numeroHabitaciones);
                    piedraBlanca.doble(numeroPersonas);
                }else if (tipoHabitacion == 2){
                    PiedraBlanca piedraBlanca = new PiedraBlanca (numeroHabitaciones,0,numeroHabitaciones);
                    piedraBlanca.doble(numeroPersonas);
                }                
            }else if ( hotel == 1){
                if (tipoHabitacion == 1){
                    PiedraAzul piedraAzul = new PiedraAzul (0,numeroHabitaciones,numeroHabitaciones);
                    piedraAzul.doble(numeroPersonas);
                }else if (tipoHabitacion == 2){
                    PiedraAzul piedraAzul = new PiedraAzul (numeroHabitaciones,0,numeroHabitaciones);
                    piedraAzul.doble(numeroPersonas);
                }
            }
            System.out.println("");
            System.out.println("Para registrar más habitaciones ingrese 1 para finalizar el proceso ingrese 0");
            desicion2 = Integer.parseInt(desicion.next());

        }
    }
}
