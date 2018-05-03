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

    private String NumeroDeHabitacion;
    private String TipoDeHabitacion;
    private boolean Disponibilidad;
    private int PrecioDeHabitacion;
    ArrayList<String> Priso = new ArrayList<>();
    ArrayList<String> NumeroHabitacion = new ArrayList<>();
    private String Piso;

    public Habitacion(){}
    
    public Habitacion(String piso, String NumeroDeHabitacion, String TipoDeHabitacion, boolean Disponibilidad, int PrecioDeHabitacion){
        this.Piso = piso;
        this.NumeroDeHabitacion = NumeroDeHabitacion;
        this.TipoDeHabitacion = TipoDeHabitacion;
        this.Disponibilidad = Disponibilidad;
        this.PrecioDeHabitacion = PrecioDeHabitacion;
    }
    

    
    public void AgregarPisoInicial(){
        Priso.add("A");
        Priso.add("B");
        Priso.add("C");
        Priso.add("D");
        Priso.add("E");
        Priso.add("F");
    }
    
    public void MostrarPisos(){
        for(int i = 0; i < Priso.size(); i++) {
        System.out.println(Priso.get(i));
        
        }
    }
    
//    public void asignarTipo(){
//        if ()
//    }
//    
//    
    
    public void setPiso (String piso){
        this.Piso = piso;
    }
    
    public String getPiso (){
        return Piso;
    }
    public void setNumeroDeHabitacion (String NumeroDeHabitacion){
        this.NumeroDeHabitacion = NumeroDeHabitacion;
    }
    
    public String getNumeroDeHabitacion (){
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
