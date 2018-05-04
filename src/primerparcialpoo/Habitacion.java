/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *Todos los commit que se realizaron el dia miercoles 2 de abril alrededor de las
 * 12 horas del mediodia, fueron realizadas por este autor, con el error de
 * subirlos a nombre de la cuenta uca.
 * @author Steven Diaz
 */
public class Habitacion {

    private int NumeroDeHabitacion;
    private String TipoDeHabitacion;
    private boolean Disponibilidad;
    private int PrecioDeHabitacion;
    ArrayList<String> Priso = new ArrayList<>();
    ArrayList<String> NumeroHabitacion = new ArrayList<>();
    private String Piso;

    public Habitacion(){}
    
    public Habitacion(String TipoDeHabitacion, boolean Disponibilidad, int PrecioDeHabitacion){
        this.NumeroDeHabitacion = NumeroDeHabitacion;
        this.TipoDeHabitacion = TipoDeHabitacion;
        this.Disponibilidad = Disponibilidad;
        this.PrecioDeHabitacion = PrecioDeHabitacion;
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public void AgregarPisoInicial(){
        Piso.add("A");
        Piso.add("B");
        Piso.add("C");
        Piso.add("D");
        Piso.add("E");
        Piso.add("F");
    }
    
    public void recibirNuevaHabitacion() {
        
    }
    
    public void MostrarPisos(){
        for(int i = 0; i < Piso.size(); i++) {
        System.out.println(Piso.get(i));
        
        }
    }
    

    
    public void MostrarNumeroHabitacion(){
        for(int i = 0; i < Piso.size(); i++) {
        System.out.println(Piso.get(i));
        
        }
    }
    
    public void asignarTipoHabitacion(){
        if (NumeroDeHabitacion%2 ==0){
            TipoDeHabitacion = "Doble";
        }
        else {
            TipoDeHabitacion = "Simple";
        }
    }
    
    
    public void Disponibilidad(){
        if (reservacion == true){
            Disponibilidad = false;
        }
        else {
            Disponibilidad = true;
        }
    }
    
    

    public void setNumeroDeHabitacion (int NumeroDeHabitacion){
        this.NumeroDeHabitacion = NumeroDeHabitacion;
    }
    
    public int getNumeroDeHabitacion (){
        return NumeroDeHabitacion;
    }
    public void setTipoDeHabitacion (String TipoDeHabitacion){
        this.TipoDeHabitacion = TipoDeHabitacion;
    }
    
    public String getTipoDeHabitacion (){
        return TipoDeHabitacion;
    }
    public void setDisponibilidad (boolean Disponibilidad){
        this.Disponibilidad = Disponibilidad;
    }
    
    public boolean getDisponibilidad (){
        return Disponibilidad;
    }
    public void setPrecioDeHabitacion (int PrecioDeHabitacion){
        this.PrecioDeHabitacion = PrecioDeHabitacion;
    }
    
    public int getPrecioDeHabitacion (){
        return PrecioDeHabitacion;
    }
}
