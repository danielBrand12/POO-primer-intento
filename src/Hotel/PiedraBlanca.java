/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hotel;

/**
 *
 * @author Daniel
 */
public class PiedraBlanca extends CostaAzul {
   
    protected int habitacionesDoblesOcupadas1;
    protected int habitacionesDoblesDisponibles1 = 50;
    protected int habitacionesCuadruplesOcupadas1;
    protected int habitacionesCuadruplesDesocupadas1 = 50;
    protected int totalHabitaciones1 = 100;
    protected int totalHabitacionesOcupadas1;
    protected int totalHabitacionesDisponibles1 = 100;
    protected int montoDeIngreso1;
    protected String nombreHotel = "Piedra Blanca";

    public PiedraBlanca(int habitacionesCuadruplesOcupadas, int habitacionesDoblesOcupadas, int totalHabitacionesOcupadas) {
        super(habitacionesCuadruplesOcupadas, habitacionesDoblesOcupadas, totalHabitacionesOcupadas);
        this.habitacionesCuadruplesOcupadas1 = habitacionesCuadruplesOcupadas;
        this.habitacionesDoblesOcupadas1 = habitacionesDoblesOcupadas;       
        this.totalHabitacionesOcupadas1 = totalHabitacionesOcupadas;
    }
       
     public void mostrarGeneralPiedraBlanca(){
        int disponiblesMenosOcupadas = totalHabitacionesDisponibles1 - totalHabitacionesOcupadas1;
        int dobleDispoMenosOcu = habitacionesDoblesDisponibles1 - habitacionesDoblesOcupadas1;
        int cuadrupleDispoMenosOcu = habitacionesCuadruplesDesocupadas1 - habitacionesCuadruplesOcupadas1;
        System.out.println(nombreHotel + " tiene un total de " + totalHabitaciones1 + " habitaciones");
        System.out.println(habitacionesDoblesOcupadas1 + " Habitaciones dobles ocupadas");
        System.out.println(dobleDispoMenosOcu + " Habitaciones dobles disponibles");
        System.out.println(habitacionesCuadruplesOcupadas1 + " Habitaciones cuádruples ocupadas");
        System.out.println(cuadrupleDispoMenosOcu + " Habitaciones cuádruples desocupadas");
        System.out.println(disponiblesMenosOcupadas + " habitaciones disponibles y " + totalHabitacionesOcupadas1 + " habitaciones ocupadas");
    }

    @Override
    public void doble(int personas) {
        System.out.println("");
        System.out.println("El precio de una habitación doble en el resort piedra blanca es de 200.000 por persona");
        System.out.println("Usted debe de pagar " + (200000*personas));
        System.out.println("------------------------------------------------------");
        mostrarGeneral();
        System.out.println("------------------------------------------------------");
        mostrarGeneralPiedraBlanca();
    }

    @Override
    public void cuadruple(int personas) {
        System.out.println("");
        System.out.println("El precio de una habitación cuádruple en el resort piedra blanca es de 500.000 por persona");
        System.out.println("Usted debe de pagar " + (500000*personas));
        System.out.println("------------------------------------------------------");
        mostrarGeneral();
        System.out.println("------------------------------------------------------");
        mostrarGeneralPiedraBlanca();
    }
}
