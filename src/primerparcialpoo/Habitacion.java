/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerparcialpoo;

import java.util.ArrayList;
import java.util.Iterator;
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
    ArrayList<String> Piso = new ArrayList<>();
    ArrayList<String> NumeroHabitacion = new ArrayList<>();

    int [] CantHabitaciones = new int[20];

    public Habitacion(){}
    
    public Habitacion(String TipoDeHabitacion, boolean Disponibilidad, int PrecioDeHabitacion){ 
        this.TipoDeHabitacion = TipoDeHabitacion;
        this.Disponibilidad = Disponibilidad;
        this.PrecioDeHabitacion = PrecioDeHabitacion;
    }
    
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public void AgregarPisoInicial(int Cant){
        switch(Cant){
            case 6:
                Piso.add("A");
                Piso.add("B");
                Piso.add("C");
                Piso.add("D");
                Piso.add("F");
                Piso.add("G");
                break;
            case 7:
                Piso.add("A");
                Piso.add("B");
                Piso.add("C");
                Piso.add("D");
                Piso.add("E");
                Piso.add("F");
                Piso.add("G");
                break;
            case 8:
                Piso.add("A");
                Piso.add("B");
                Piso.add("C");
                Piso.add("D");
                Piso.add("E");
                Piso.add("F");
                Piso.add("G");
                Piso.add("H");
                break;
            case 9:
                Piso.add("A");
                Piso.add("B");
                Piso.add("C");
                Piso.add("D");
                Piso.add("E");
                Piso.add("F");
                Piso.add("G");
                Piso.add("H");
                Piso.add("I");
                break;
            case 10:
                Piso.add("A");
                Piso.add("B");
                Piso.add("C");
                Piso.add("D");
                Piso.add("E");
                Piso.add("F");
                Piso.add("G");
                Piso.add("H");
                Piso.add("I");
                Piso.add("J");
                break;
            case 11:
                Piso.add("A");
                Piso.add("B");
                Piso.add("C");
                Piso.add("D");
                Piso.add("E");
                Piso.add("F");
                Piso.add("G");
                Piso.add("H");
                Piso.add("I");
                Piso.add("J");
                Piso.add("K");
                break;
            case 12:
                Piso.add("A");
                Piso.add("B");
                Piso.add("C");
                Piso.add("D");
                Piso.add("E");
                Piso.add("F");
                Piso.add("G");
                Piso.add("H");
                Piso.add("I");
                Piso.add("J");
                Piso.add("K");
                Piso.add("L");
                break;
            case 13:
                Piso.add("A");
                Piso.add("B");
                Piso.add("C");
                Piso.add("D");
                Piso.add("E");
                Piso.add("F");
                Piso.add("G");
                Piso.add("H");
                Piso.add("I");
                Piso.add("J");
                Piso.add("K");
                Piso.add("L");
                Piso.add("M");
                break;
            case 14:
                Piso.add("A");
                Piso.add("B");
                Piso.add("C");
                Piso.add("D");
                Piso.add("E");
                Piso.add("F");
                Piso.add("G");
                Piso.add("H");
                Piso.add("I");
                Piso.add("J");
                Piso.add("K");
                Piso.add("L");
                Piso.add("M");
                Piso.add("N");
                break;
            case 15:
                Piso.add("A");
                Piso.add("B");
                Piso.add("C");
                Piso.add("D");
                Piso.add("E");
                Piso.add("F");
                Piso.add("G");
                Piso.add("H");
                Piso.add("I");
                Piso.add("J");
                Piso.add("K");
                Piso.add("L");
                Piso.add("M");
                Piso.add("N");
                Piso.add("O");
                break;
        }
        
    }
    
    public void AgregarHabitaciones(int Cant){
        for (int i = 0; i < Cant; i++){
            CantHabitaciones[i]=i+1;
        }
    }
    
    public void MostrarPisos(){
        for(int i = 0; i < Piso.size(); i++) {
            System.out.println(Piso.get(i));
        
        }
    }
    
    public void MostrarNumeroHabitacion(){
        int i = 0;
        while (i < CantHabitaciones.length){
            if(CantHabitaciones[i] != 0){
                System.out.println(CantHabitaciones[i]);
            }
            i++;
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
    
    
    public void Disponibilidad(String piso){
        boolean reservacion = true;
        
        if (reservacion == true){
            if (Disponibilidad == true){
                Disponibilidad = false;
            }
            else {
            Disponibilidad = false;
            }
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
