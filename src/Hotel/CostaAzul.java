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
//como ya hay un método abstracto la clase también debe de ser abstracta
public abstract class CostaAzul {
    //Atributos de la cadena hotelera costa azul
    protected int habitacionesDoblesOcupadas;
    protected int habitacionesDoblesDisponibles = 75;
    protected int habitacionesCuadruplesOcupadas;
    protected int habitacionesCuadruplesDesocupadas = 75;
    protected int totalHabitaciones = 150;
    protected int totalHabitacionesOcupadas;
    protected int totalHabitacionesDisponibles = 150;
    protected int montoDeIngreso;
    protected String nombreHotel = "Costa Azul";
    
    //Constructor para otorgar los valores a nobreHotel y al totalHabitaciones
    public CostaAzul (int habitacionesCuadruplesOcupadas, int habitacionesDoblesOcupadas, int totalHabitacionesOcupadas){
        this.habitacionesCuadruplesOcupadas = habitacionesCuadruplesOcupadas;
        this.habitacionesDoblesOcupadas = habitacionesDoblesOcupadas;       
        this.totalHabitacionesOcupadas = totalHabitacionesOcupadas;
    }
    
    //métodos abstractos cuya implementacion en als clases heredads puede variar
    public abstract void doble(int personas);
    public abstract void cuadruple(int personas);
    
    //visualización de costa azul en total
    public void mostrarGeneral(){
        int disponiblesMenosOcupadas = totalHabitacionesDisponibles - totalHabitacionesOcupadas;
        int dobleDispoMenosOcu = habitacionesDoblesDisponibles - habitacionesDoblesOcupadas;
        int cuadrupleDispoMenosOcu = habitacionesCuadruplesDesocupadas - habitacionesCuadruplesOcupadas;
        System.out.println(nombreHotel + " tiene un total de " + totalHabitaciones + " habitaciones");
        System.out.println(habitacionesDoblesOcupadas + " Habitaciones dobles ocupadas");
        System.out.println(dobleDispoMenosOcu + " Habitaciones dobles disponibles");
        System.out.println(habitacionesCuadruplesOcupadas + " Habitaciones cuádruples ocupadas");
        System.out.println(cuadrupleDispoMenosOcu + " Habitaciones cuádruples desocupadas");
        System.out.println(disponiblesMenosOcupadas + " habitaciones disponibles y " + totalHabitacionesOcupadas + " habitaciones ocupadas");
    }

    
}
